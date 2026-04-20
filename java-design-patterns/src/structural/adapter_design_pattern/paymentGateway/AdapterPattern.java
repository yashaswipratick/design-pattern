package structural.adapter_design_pattern.paymentGateway;

import structural.adapter_design_pattern.paymentGateway.adaptee.PayPalSDK;
import structural.adapter_design_pattern.paymentGateway.adaptee.RazorpaySDK;
import structural.adapter_design_pattern.paymentGateway.adaptee.StripeSDK;
import structural.adapter_design_pattern.paymentGateway.adapters.PayPalAdapter;
import structural.adapter_design_pattern.paymentGateway.adapters.RazorpayAdapter;
import structural.adapter_design_pattern.paymentGateway.adapters.StripeAdapter;
import structural.adapter_design_pattern.paymentGateway.client.PaymentOrderService;

public class AdapterPattern {

    public static void main(String[] args) {

        // Same PaymentOrderService, different provider — just swap the adapter!
        PaymentOrderService stripeOrder = new PaymentOrderService(
                new StripeAdapter(new StripeSDK())
        );
        stripeOrder.checkoutPayment(100.00);

        PaymentOrderService paypalOrder = new PaymentOrderService(
                new PayPalAdapter(new PayPalSDK())
        );
        paypalOrder.checkoutPayment(200.00);

        PaymentOrderService razorpayOrder = new PaymentOrderService(
                new RazorpayAdapter(new RazorpaySDK())
        );
        razorpayOrder.checkoutPayment(300.00);
    }
}
