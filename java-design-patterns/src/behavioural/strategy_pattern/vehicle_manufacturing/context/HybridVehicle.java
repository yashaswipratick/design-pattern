package behavioural.strategy_pattern.vehicle_manufacturing.context;

import behavioural.strategy_pattern.vehicle_manufacturing.strategy.DriveStrategy;

public class HybridVehicle extends Vehicle {
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
