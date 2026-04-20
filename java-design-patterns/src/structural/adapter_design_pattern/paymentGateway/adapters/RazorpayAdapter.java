package structural.adapter_design_pattern.paymentGateway.adapters;

import structural.adapter_design_pattern.paymentGateway.PaymentGateway;
import structural.adapter_design_pattern.paymentGateway.adaptee.RazorpaySDK;

//ADAPTERS — wrap each SDK behind PaymentGateway
public class RazorpayAdapter implements PaymentGateway {

    private RazorpaySDK razorpaySDK;

    public RazorpayAdapter(RazorpaySDK razorpaySDK) {
        this.razorpaySDK = razorpaySDK;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("[RazorpayAdapter] Delegating to Razorpay SDK...");
        razorpaySDK.initiateRazorPayment(amount);  // translates the call
    }
}
