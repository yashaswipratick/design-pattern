package structural.adapter_design_pattern.paymentGateway.adaptee;


// ADAPTEES — third party SDKs you cannot modify
// Stripe SDK (3rd party — cannot change)
public class StripeSDK {

    public void makeStripePayment(double amount) {
        System.out.println("Stripe SDK: processing $" + amount);
    }
}
