package behavioural.strategy_pattern.vehicle_manufacturing.context;

import behavioural.strategy_pattern.vehicle_manufacturing.strategy.DriveStrategy;

// Context class - holds reference to a strategy object
public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName());
        driveStrategy.drive();
    }
}
