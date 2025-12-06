package behavioural.strategy_pattern.shopping_cart;

import behavioural.strategy_pattern.shopping_cart.context.ShoppingCart;
import behavioural.strategy_pattern.shopping_cart.strategy.CreditCardPaymentStrategy;
import behavioural.strategy_pattern.shopping_cart.strategy.PayPalPaymentStrategy;
import behavioural.strategy_pattern.shopping_cart.strategy.UPIPaymentStrategy;

public class Demo {

    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Payment Processor######");

        ShoppingCart creditCard = new ShoppingCart(new CreditCardPaymentStrategy("1234 4567 8910"));
        creditCard.pay(100);

        ShoppingCart payPal = new ShoppingCart(new PayPalPaymentStrategy("abc@gmail.com"));
        payPal.pay(200);

        ShoppingCart upi = new ShoppingCart(new UPIPaymentStrategy("abc@okicici"));
        upi.pay(300);
    }
}
