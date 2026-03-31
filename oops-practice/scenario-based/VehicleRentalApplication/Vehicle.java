public class Vehicle {

    // Protected so child classes can directly access
    protected int vehicleId;
    protected String brand;
    protected double baseRate;

    public Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
    }
}
