package LLD.dto.builders;

import LLD.dto.Payment;

import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentBuilder {

    public String paymentId;
    public String accountId; // public Key
    public String customerId; // Foreign Key
    public Double balance;
    public LocalDateTime transactionTimestamp;

    public PaymentBuilder setPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public PaymentBuilder setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public PaymentBuilder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public PaymentBuilder setBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    public PaymentBuilder setTransactionTimestamp(LocalDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
        return this;
    }
    
    public Payment build() {
        return new Payment(this);
    }
}
