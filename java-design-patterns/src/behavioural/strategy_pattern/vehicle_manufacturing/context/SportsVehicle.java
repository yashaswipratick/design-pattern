package behavioural.strategy_pattern.vehicle_manufacturing.context;

import behavioural.strategy_pattern.vehicle_manufacturing.strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
