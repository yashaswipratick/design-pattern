package structural.adapter_design_pattern.paymentGateway.adapters;

import structural.adapter_design_pattern.paymentGateway.PaymentGateway;
import structural.adapter_design_pattern.paymentGateway.adaptee.PayPalSDK;
import structural.adapter_design_pattern.paymentGateway.adaptee.StripeSDK;

//ADAPTERS — wrap each SDK behind PaymentGateway
public class PayPalAdapter implements PaymentGateway {

    private PayPalSDK payPalSDK;

    public PayPalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("[PayPalAdapter] Delegating to PayPal SDK...");
        payPalSDK.sendPayPalPayment(amount);// translates the call
    }
}
