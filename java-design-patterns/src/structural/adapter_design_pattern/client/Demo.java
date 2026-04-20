package structural.adapter_design_pattern.client;

import structural.adapter_design_pattern.adapter.WeighingMachineAdapter;
import structural.adapter_design_pattern.adapter.WeighingMachineAdapterImpl;
import structural.adapter_design_pattern.Adaptee.ImperialWeighingMachine;
import structural.adapter_design_pattern.Adaptee.ImperialWeighingMachineImpl;

public class Demo {

    // Client - Metric Weighing Machine
    public static void main(String[] args) {
        System.out.println("======= Adapter Design Pattern ======");

        // ImperialWeighingMachine - // Existing weighing machine is used to weigh the baby in pounds
        double weighingScaleReading = 25.0;

        ImperialWeighingMachine imperialWeighingMachine = new ImperialWeighingMachineImpl(weighingScaleReading);

        // Adapter to convert to KG
        WeighingMachineAdapter weighingMachineAdapter = new WeighingMachineAdapterImpl(imperialWeighingMachine);

        // Client gets weight in Kilograms
        System.out.println(weighingMachineAdapter.weightInKG());
    }
}
