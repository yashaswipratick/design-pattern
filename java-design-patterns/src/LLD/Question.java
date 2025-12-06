package LLD;

import LLD.services.BankingSystem;
import LLD.services.BankingSystemImpl;

import java.time.LocalDateTime;
import java.util.List;

public class Question {
    /**
     * You are required to design and implement a simplified Banking System that supports a sequence of operations
     * that evolve in complexity across 4 levels.
     *
     * You must implement all features using:
     *
     * BankingSystem interface
     *
     * BankingSystemImpl class
     *
     * Java primitive data structures (Maps, Lists, Sets)
     *
     * NO additional classes like ScheduledPayment, Transaction, Account, and NO inner classes
     *
     * You must use collections (Maps, Lists) to represent everything.
     *
     * ⭐ LEVEL 1 — Basic Banking Operations
     * 1️⃣ Create Account
     * boolean createAccount(String accountId, int timestamp, int initialBalance)
     *
     *
     * Creates a new account with the given accountId.
     *
     * Sets the account balance to initialBalance.
     *
     * If the account already exists, return false.
     *
     * 2️⃣ Deposit
     * Optional<Integer> deposit(int timestamp, String accountId, int amount)
     *
     *
     * Deposits amount into the given account.
     *
     * Returns Optional.of(newBalance) if successful.
     *
     * Returns Optional.empty() if:
     *
     * account does not exist, or
     *
     * amount is invalid
     *
     * 3️⃣ Transfer
     * Optional<Integer> transfer(int timestamp, String sourceAccountId, String targetAccountId, int amount)
     *
     *
     * Moves money from sourceAccountId → targetAccountId.
     *
     * Deducts from source, adds to target.
     *
     * Tracks outgoing total for ranking.
     *
     * Returns Optional.of(sourceNewBalance) if successful.
     *
     * Returns Optional.empty() if:
     *
     * either account doesn't exist
     *
     * insufficient balance
     *
     * negative amount
     *
     * ⭐ LEVEL 2 — Rank Top N Spenders
     * 4️⃣ Top Spenders
     * List<String> topSpenders(int timestamp, int n)
     *
     *
     * Compute each account’s total outgoing amount from ALL:
     *
     * transfers OUT
     *
     * payments
     *
     * withdrawals
     *
     * Sort by:
     *
     * Highest outgoing (descending)
     *
     * If tie → accountId alphabetical (ascending)
     *
     * Return a list of strings:
     *
     * "accountId,totalOutgoing"
     *
     *
     * Example:
     *
     * ["A101,500", "A102,300", "A103,0"]
     *
     * ⭐ LEVEL 3 — Payments With Cashback
     * 5️⃣ Pay
     * Optional<String> pay(int timestamp, String accountId, int amount)
     *
     *
     * A "payment" is a withdrawal with cashback.
     *
     * Rules:
     *
     * Deduct amount immediately.
     *
     * Increase outgoing total.
     *
     * Generate 2% cashback, rounded down.
     *
     * Cashback is credited after exactly 24 hours.
     *
     * A unique payment ID must be generated:
     */

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystemImpl();
        LocalDateTime now = LocalDateTime.now();
        bankingSystem.createAccount("123", now, 5000.00);//8000
        bankingSystem.createAccount("456", now, 6000.00);//5000
        bankingSystem.createAccount("789", now, 7000.00);//5000

        bankingSystem.transfer(LocalDateTime.now(), "123", "456", 2000.00);
        bankingSystem.transfer(LocalDateTime.now(), "456", "789", 3000.00);
        bankingSystem.transfer(LocalDateTime.now(), "789", "123", 5000.00);

        List<String> topSpenders = bankingSystem.topSpenders(now, 2);
        System.out.println(topSpenders);
    }
}
