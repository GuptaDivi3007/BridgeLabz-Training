public class Car extends Vehicle implements IRentable {

    public Car(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 500; // extra service charge
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
    }
}
