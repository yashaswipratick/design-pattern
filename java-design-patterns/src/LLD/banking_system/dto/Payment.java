package LLD.banking_system.dto;

import LLD.banking_system.dto.builders.PaymentBuilder;

import java.time.LocalDateTime;

public class Payment {

    private String paymentId;
    private String accountId; // private Key
    private String customerId; // Foreign Key
    private Double balance;
    private LocalDateTime transactionTimestamp;

    public Payment(PaymentBuilder paymentBuilder) {
        this.paymentId = paymentId;
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
        this.transactionTimestamp = transactionTimestamp;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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

    /*public static  class AccountBuilder {
        private String accountId; // private Key
        private String customerId; // Foreign Key

        //optional
        private Double balance;
        private LocalDateTime transactionTimestamp;

        public AccountBuilder(String accountId, String customerId) {
            this.accountId = accountId;
            this.customerId = customerId;
        }

        public AccountBuilder setBalance(Double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder setTimeStamp(LocalDateTime timeStamp) {
            this.transactionTimestamp = timeStamp;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }*/
}
