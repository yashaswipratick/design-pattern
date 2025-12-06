package LLD.banking_system.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BankingSystem {

    boolean createAccount(String accountId, LocalDateTime timestamp, double initialBalance);

    Optional<Double> deposit(LocalDateTime timestamp, String accountId, double amount);

    List<String> topSpenders(LocalDateTime timestamp, int n);

    Optional<Double> transfer(LocalDateTime timestamp, String sourceAccountId, String targetAccountId, double amount);

    Optional<String> pay(LocalDateTime timestamp, String accountId, double amount);
}
