package behavioural.strategy_pattern.vehicle_manufacturing.strategy;

public class ElectricDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Electric Drive capability");
    }
}
