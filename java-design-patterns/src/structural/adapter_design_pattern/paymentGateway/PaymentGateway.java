package structural.adapter_design_pattern.paymentGateway;


//TARGET INTERFACE — what your app expects. All payments go through this single contract
public interface PaymentGateway {

    void processPayment(double amount);
}
