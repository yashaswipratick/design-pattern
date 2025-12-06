package behavioural.strategy_pattern.vehicle_manufacturing.strategy;

public class SportsDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive capability");
    }
}
