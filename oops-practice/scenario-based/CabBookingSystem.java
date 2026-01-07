import java.util.*;

public class CabBookingSystem {

    public static void main(String[] args) {

        User user = new User(1, "Divyanshi");

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(101, "Amit", true));
        drivers.add(new Driver(102, "Rohit", false));

        FareCalculator fareCalculator = new PeakFareCalculator();

        try {
            Ride ride = RideService.bookRide(user, drivers, 12.5, fareCalculator);
            user.addRide(ride);
        }
        catch (NoDriverAvailableException e) {
            // handled gracefully
        }
    }

    public static class User {
        public int userId;
        public String name;
        public List<Ride> rideHistory;

        public User(int userId, String name) {
            this.userId = userId;
            this.name = name;
            this.rideHistory = new ArrayList<>();
        }

        public void addRide(Ride ride) {
            rideHistory.add(ride);
        }
    }

    public static class Driver {
        public int driverId;
        public String name;
        public boolean available;

        public Driver(int driverId, String name, boolean available) {
            this.driverId = driverId;
            this.name = name;
            this.available = available;
        }
    }

    public static class Ride {
        public User user;
        public Driver driver;
        public double distance;
        public double fare;

        public Ride(User user, Driver driver, double distance, double fare) {
            this.user = user;
            this.driver = driver;
            this.distance = distance;
            this.fare = fare;
        }
    }

    public static class RideService {

        public static Ride bookRide(User user, List<Driver> drivers,
                                    double distance, FareCalculator calculator)
                                    throws NoDriverAvailableException {

            Driver assignedDriver = assignDriver(drivers);
            double fare = calculator.calculateFare(distance);

            assignedDriver.available = false;

            return new Ride(user, assignedDriver, distance, fare);
        }

        public static Driver assignDriver(List<Driver> drivers) throws NoDriverAvailableException {

            for (Driver driver : drivers) {
                if (driver.available) {
                    return driver;
                }
            }
            throw new NoDriverAvailableException("No driver available");
        }
    }

    public interface FareCalculator {
        public double calculateFare(double distance);
    }

    // polymorphism
    public static class NormalFareCalculator implements FareCalculator {
        public double calculateFare(double distance) {
            return distance * 10;
        }
    }
    public static class PeakFareCalculator implements FareCalculator {
        public double calculateFare(double distance) {
            return distance * 15;
        }
    }


    public static class NoDriverAvailableException extends Exception {
        public NoDriverAvailableException(String message) {
            super(message);
        }
    }
}
