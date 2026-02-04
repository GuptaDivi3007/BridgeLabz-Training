package SmartVehicleDashboard;

public class Main {
	public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle electricCar = new ElectricCar();

        car.displaySpeed();
        car.displayBatteryPercentage();

        bike.displaySpeed();
        bike.displayBatteryPercentage();

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}
