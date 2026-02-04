package MultiVehicleRentalSystem;

public class Bikes implements Vehicle{
	
	public void rent() {
        System.out.println("Bike has been rented");
    }

    public void returnVehicle() {
        System.out.println("Bike has been returned");
    }
}
