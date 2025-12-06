package LLD.services;

import LLD.dto.Account;
import LLD.dto.Customer;
import LLD.dto.Payment;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BankingSystemImpl implements BankingSystem {

    Map<String, Customer> customerDetails;
    Map<String, Account> accountDetails;
    Map<String, Account> transactionDetails;
    Map<String, Payment> cashBackDetails;

    public BankingSystemImpl() {
        this.customerDetails = new ConcurrentHashMap<>();
        this.accountDetails = new ConcurrentHashMap<>();
        this.transactionDetails = new ConcurrentHashMap<>();
    }

    @Override
    public boolean createAccount(String accountId, LocalDateTime timestamp, double initialBalance) {

        //If the account already exists, return false.

        if (accountDetails.containsKey(accountId)) {
            System.out.println("Account already exists. accountId - " + accountId);
            return false;
        }
        //Creates a new account with the given accountId and Sets the account balance to initialBalance.
        Account account = new Account(accountId, "CUST_" + UUID.randomUUID(), initialBalance, timestamp);

        accountDetails.put(accountId, account);
        System.out.println("Account created successfully. accountId - " + accountId);
        return true;
    }

    @Override
    public Optional<Double> deposit(LocalDateTime timestamp, String accountId, double amount) {

        //check if account exists and amount is valid.
        if (!accountDetails.containsKey(accountId) || amount <= 0) {
            return Optional.empty();
        }

        // Process the deposit request
        Account account = accountDetails.get(accountId);
        account.setBalance(account.getBalance() + amount);
        account.setTransactionTimestamp(timestamp);
        accountDetails.put(accountId, account);
        return Optional.of(account.getBalance());
    }

    @Override
    public List<String> topSpenders(LocalDateTime timestamp, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((Comparator.comparingDouble(o -> o.value)));

        for (Map.Entry<String, Account> entry : transactionDetails.entrySet()) {
            if (entry.getValue().getTransactionTimestamp().isAfter(timestamp)) {
                pq.add(new Pair(entry.getKey(), entry.getValue().getBalance()));
                if (pq.size() > n) {
                    pq.poll();
                }
            }
        }

        List<String> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Pair pair = pq.poll();
            list.add(sb.append(pair.key).append(" -> ").append(pair.value).toString());
        }
        Collections.reverse(list);
        return list;
    }

    @Override
    public Optional<Double> transfer(LocalDateTime timestamp, String sourceAccountId, String targetAccountId, double amount) {
        //check if account exists and amount is valid.
        if (!accountDetails.containsKey(sourceAccountId) || !accountDetails.containsKey(targetAccountId)
                || amount <= 0) {
            return Optional.empty();
        }

        Account srcAccount = accountDetails.get(sourceAccountId);
        if (srcAccount.getBalance() < amount) {
            return Optional.empty();
        }

        // Process the transfer request
        double debit = srcAccount.getBalance() - amount;
        srcAccount.setBalance(debit);
        srcAccount.setTransactionTimestamp(timestamp);
        accountDetails.put(sourceAccountId, srcAccount);

        if (transactionDetails.isEmpty() || !transactionDetails.containsKey(sourceAccountId)) {
            Account transaction = new Account(srcAccount.getAccountId(), srcAccount.getCustomerId(), amount, timestamp);
            transactionDetails.put(sourceAccountId, transaction);
        } else {
            Account transaction = transactionDetails.get(sourceAccountId);
            transaction.setBalance(transaction.getBalance() +  amount);
            transaction.setTransactionTimestamp(timestamp);
            transactionDetails.put(transaction.getAccountId(), transaction);
        }


        Account destAccount = accountDetails.get(targetAccountId);
        destAccount.setBalance(destAccount.getBalance() + amount);
        destAccount.setTransactionTimestamp(timestamp);
        accountDetails.put(targetAccountId, destAccount);

        return Optional.of(srcAccount.getBalance());
    }

    @Override
    public Optional<String> pay(LocalDateTime timestamp, String accountId, double amount) {

        //check if account exists and amount is valid.
        if (!accountDetails.containsKey(accountId) || amount <= 0) {
            return Optional.empty();
        }

        Account srcAccount = accountDetails.get(accountId);
        if (srcAccount.getBalance() < amount) {
            return Optional.empty();
        }

        double cashback = ((amount * 2)/100);
        Payment payment = new Payment(UUID.randomUUID(), accountId, accountDetails.get(accountId).getCustomerId(), cashback, LocalDateTime.now());
        cashBackDetails.put(accountId, payment);
        Account account = accountDetails.get(accountId);
        account.setBalance(account.getBalance() - amount);
        account.setTransactionTimestamp(timestamp);
        accountDetails.put(accountId, account);
        return Optional.of(payment.getPaymentId());
    }
}
