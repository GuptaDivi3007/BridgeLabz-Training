public class Truck extends Vehicle implements IRentable {

    public Truck(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 1000; // heavy vehicle charge
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
    }
}
