package behavioural.strategy_pattern.shopping_cart.strategy;

// Concrete strategy - for credit card payment
public class CreditCardPaymentStrategy implements PaymentStrategy{

    String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("payment successful. card: " + this.cardNumber + " amount: " + amount);
    }
}
