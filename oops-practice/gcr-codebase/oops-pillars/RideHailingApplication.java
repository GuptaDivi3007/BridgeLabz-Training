import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    String getVehicleId() {
        return vehicleId;
    }

    String getDriverName() {
        return driverName;
    }

    abstract double calculateFare(double distance);

    void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";

    Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String location = "Unknown";

    Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return distance * ratePerKm * 0.8;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String location = "Unknown";

    Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return distance * ratePerKm * 0.9;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

public class RideHailingApplication {

    static void calculateRideFare(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: " + v.calculateFare(distance));

            if (v instanceof GPS) {
                System.out.println("Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Car car = new Car("CAR01", "Rohan", 15);
        Bike bike = new Bike("BIKE02", "Kannan", 10);
        Auto auto = new Auto("AUTO03", "Thamarai", 12);

        car.updateLocation("Chennai");
        bike.updateLocation("Madurai");
        auto.updateLocation("Coimbatore");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        calculateRideFare(rides, 12.5);
    }
}
