package behavioural.null_object_pattern;

public class Bike extends Vehicle {

    private String model;
    private String color;
    private int seatingCapacity;
    private int fuelTankCapacity;
    private boolean isAvailableForTestDrive;

    public Bike(String model, String color, int seatingCapacity, int fuelTankCapacity, boolean isAvailableForTestDrive) {
        this.model = model;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
        this.isAvailableForTestDrive = isAvailableForTestDrive;
    }

    @Override
    public void start() {
        System.out.println("Bike is started and moving");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public boolean isAvailableForTestDrive() {
        return isAvailableForTestDrive;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", isAvailableForTestDrive=" + isAvailableForTestDrive +
                '}';
    }
}
