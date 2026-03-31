public class Bike extends Vehicle implements IRentable {

    public Bike(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bike");
    }
}
