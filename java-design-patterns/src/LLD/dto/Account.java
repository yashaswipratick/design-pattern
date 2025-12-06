package LLD.dto;

import LLD.dto.builders.AccountBuilder;

import java.time.LocalDateTime;

public class Account {

    private String accountId; // private Key
    private String customerId; // Foreign Key
    private Double balance;
    private LocalDateTime transactionTimestamp;

    public Account(AccountBuilder accountBuilder) {
        this.accountId = accountBuilder.accountId;
        this.customerId = accountBuilder.customerId;
        this.balance = accountBuilder.balance;
        this.transactionTimestamp = accountBuilder.transactionTimestamp;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(LocalDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }
}
