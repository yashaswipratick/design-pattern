package behavioural.strategy_pattern.shopping_cart.strategy;

// Concrete strategy - for credit card payment
public class PayPalPaymentStrategy implements PaymentStrategy{

    String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("payment successful. email: " + this.email + " amount: " + amount);
    }
}
