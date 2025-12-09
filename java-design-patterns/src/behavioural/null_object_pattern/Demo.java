package behavioural.null_object_pattern;

import behavioural.null_object_pattern.factory.VehicleFactory;
import behavioural.null_object_pattern.factory.VehicleType;

public class Demo {

    public static void main(String[] args) {
        System.out.println("\n##### Null Object Pattern: Solution Demo #####");

        Vehicle car = VehicleFactory.getInstance(VehicleType.CAR);
        System.out.println(car);
        testDrive(car);

        Vehicle bike = VehicleFactory.getInstance(VehicleType.BIKE);
        System.out.println(bike);
        testDrive(bike);

        Vehicle nullVehicle = VehicleFactory.getInstance(VehicleType.NULL);
        System.out.println(nullVehicle);
        testDrive(nullVehicle);
    }

    private static void testDrive(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
}
