package behavioural.strategy_pattern.shopping_cart.strategy;

// Concrete strategy - for credit card payment
public class UPIPaymentStrategy implements PaymentStrategy{

    String upiId;

    public UPIPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("payment successful. upiId: " + this.upiId + " amount: " + amount);
    }
}
