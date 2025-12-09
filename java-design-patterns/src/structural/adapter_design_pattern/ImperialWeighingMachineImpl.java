package structural.adapter_design_pattern;

// Adaptee - Existing Incompatible class
public class ImperialWeighingMachineImpl implements ImperialWeighingMachine {

    double weight = 0;


    public ImperialWeighingMachineImpl(double weight) {
        this.weight = weight;
    }

    // Third-party weighing machine (US model) – returns pounds
    @Override
    public double getWeightInPounds() {
        return weight;
    }
}
