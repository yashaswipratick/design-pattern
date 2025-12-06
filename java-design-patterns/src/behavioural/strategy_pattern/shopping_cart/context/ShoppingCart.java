package behavioural.strategy_pattern.shopping_cart.context;

import behavioural.strategy_pattern.shopping_cart.strategy.PaymentStrategy;

// Context class - holds reference to a strategy object
public class ShoppingCart {

    PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        System.out.println(this.getClass().getSimpleName());
        paymentStrategy.pay(amount);
    }
}
