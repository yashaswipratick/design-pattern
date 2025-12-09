package behavioural.null_object_pattern.factory;

import behavioural.null_object_pattern.Bike;
import behavioural.null_object_pattern.Car;
import behavioural.null_object_pattern.NullVehicle;
import behavioural.null_object_pattern.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    static Map<VehicleType, Vehicle> map = new HashMap<>();

    static {
        map.put(VehicleType.CAR, new Car("XUV", "Black", 5, 44, true));
        map.put(VehicleType.BIKE, new Bike("RTR", "Black", 2, 10, true));
        map.put(VehicleType.NULL, new NullVehicle("", "", 0, 0, false));
    }

    public static Vehicle getInstance(VehicleType vehicleType) {
        return map.get(vehicleType);
    }
}
