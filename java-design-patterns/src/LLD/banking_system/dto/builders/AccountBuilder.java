package LLD.banking_system.dto.builders;

import LLD.banking_system.dto.Account;

import java.time.LocalDateTime;

public class AccountBuilder {

    public String accountId; // private Key
    public String customerId; // Foreign Key
    public Double balance;
    public LocalDateTime transactionTimestamp;

    public AccountBuilder setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public AccountBuilder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public AccountBuilder setBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder setTransactionTimestamp(LocalDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
        return this;
    }

    public Account build() {
        return new Account(this);
    }
}
