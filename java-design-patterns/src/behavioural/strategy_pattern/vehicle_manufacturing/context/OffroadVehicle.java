package behavioural.strategy_pattern.vehicle_manufacturing.context;

import behavioural.strategy_pattern.vehicle_manufacturing.strategy.DriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
