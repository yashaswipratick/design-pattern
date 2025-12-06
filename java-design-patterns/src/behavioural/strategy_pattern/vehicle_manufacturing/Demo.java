package behavioural.strategy_pattern.vehicle_manufacturing;

import behavioural.strategy_pattern.vehicle_manufacturing.context.*;
import behavioural.strategy_pattern.vehicle_manufacturing.strategy.ElectricDrive;
import behavioural.strategy_pattern.vehicle_manufacturing.strategy.NormalDrive;
import behavioural.strategy_pattern.vehicle_manufacturing.strategy.SportsDrive;

public class Demo {

    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Vehicle Drive Modes######");

        Vehicle sportsVehicleDrive = new SportsVehicle(new SportsDrive());
        sportsVehicleDrive.drive();

        Vehicle offRoadVehicleDrive = new OffroadVehicle(new SportsDrive());
        offRoadVehicleDrive.drive();

        Vehicle goodsVehicleDrive = new GoodsVehicle(new NormalDrive());
        goodsVehicleDrive.drive();

        Vehicle hybridVehicleDrive = new HybridVehicle(new ElectricDrive());
        hybridVehicleDrive.drive();
    }
}
