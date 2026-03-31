import java.util.*;

public class Vehicle {

    static double registrationFee = 1500.0;

    String ownerName;
    String vehicleType;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Two Wheeler");
        Vehicle v2 = new Vehicle("Anita", "Four Wheeler");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(2000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
