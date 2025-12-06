package behavioural.strategy_pattern.vehicle_manufacturing.context;

import behavioural.strategy_pattern.vehicle_manufacturing.strategy.DriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
