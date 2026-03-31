import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    String getVehicleNumber() {
        return vehicleNumber;
    }

    String getType() {
        return type;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(String number, double rate, String policy) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policy;
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String number, double rate, String policy) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policy;
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Applied";
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String number, double rate, String policy) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policy;
    }

    double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "POLC01"));
        vehicles.add(new Bike("BIKE202", 500, "POLB02"));
        vehicles.add(new Truck("TRK303", 3000, "POLT03"));

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                System.out.println("Insurance Cost: " + ((Insurable) v).calculateInsurance());
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
            System.out.println("--------------------");
        }
    }
}
