package structural.adapter_design_pattern.paymentGateway.client;

import structural.adapter_design_pattern.paymentGateway.PaymentGateway;

//CLIENT — only knows PaymentGateway, nothing else
public class PaymentOrderService {

    private PaymentGateway paymentGateway;

    public PaymentOrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkoutPayment(double amount) {
        System.out.println("OrderService: checkout initiated...");
        paymentGateway.processPayment(amount);
        System.out.println("OrderService: payment done!\n");
    }
}
