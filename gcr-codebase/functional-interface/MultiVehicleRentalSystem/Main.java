package MultiVehicleRentalSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car=new Car();
        Bikes bike=new Bikes();
        car.rent();
        car.returnVehicle();
        bike.rent();
        bike.returnVehicle();
	}

}
