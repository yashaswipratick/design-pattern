package structural.adapter_design_pattern.paymentGateway.adaptee;

// ADAPTEES — third party SDKs you cannot modify
// Razorpay SDK (3rd party — cannot change)
public class RazorpaySDK {

    public void initiateRazorPayment(double amount) {
        System.out.println("Razorpay SDK: initiating ₹" + amount);
    }
}
