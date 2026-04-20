package structural.adapter_design_pattern.paymentGateway.adaptee;

// ADAPTEES — third party SDKs you cannot modify
// PayPal SDK (3rd party — cannot change)
public class PayPalSDK {

    public void sendPayPalPayment(double amount) {
        System.out.println("PayPal SDK: sending $" + amount);
    }
}
