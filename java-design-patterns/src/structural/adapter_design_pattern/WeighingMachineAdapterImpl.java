package structural.adapter_design_pattern;

// Concrete Adapter converts pounds → kg
public class WeighingMachineAdapterImpl implements WeighingMachineAdapter{

    // Adaptee Reference
    ImperialWeighingMachine imperialWeighingMachine;

    public WeighingMachineAdapterImpl(ImperialWeighingMachine imperialWeighingMachine) {
        this.imperialWeighingMachine = imperialWeighingMachine;
    }

    @Override
    public double weightInKG() {

        double weightInPounds = imperialWeighingMachine.getWeightInPounds();

        // Conversion formula: 1 pound = 0.453592 kg
        return weightInPounds * 0.45;
    }
}
