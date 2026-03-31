import java.util.*;

public class VehicleRentalApp {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add Vehicle\n2.View Vehicles\n3.Delete Vehicle\n4.Calculate Rent\n5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> viewVehicles();
                case 3 -> deleteVehicle();
                case 4 -> calculateRent();
                case 5 -> System.exit(0);
            }
        }
    }

    // CREATE
    static void addVehicle() {
        System.out.println("1.Bike  2.Car  3.Truck");
        int type = sc.nextInt();

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Brand: ");
        String brand = sc.next();

        System.out.print("Enter Base Rate: ");
        double rate = sc.nextDouble();

        if (type == 1)
            vehicles.add(new Bike(id, brand, rate));
        else if (type == 2)
            vehicles.add(new Car(id, brand, rate));
        else
            vehicles.add(new Truck(id, brand, rate));

        System.out.println("Vehicle Added Successfully");
    }

    // READ
    static void viewVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("----------------");
        }
    }

    // DELETE
    static void deleteVehicle() {
        System.out.print("Enter Vehicle ID to delete: ");
        int id = sc.nextInt();

        vehicles.removeIf(v -> v.getVehicleId() == id);
        System.out.println("Vehicle Deleted");
    }

    // RENT CALCULATION
    static void calculateRent() {
        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Days: ");
        int days = sc.nextInt();

        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id && v instanceof IRentable) {
                double rent = ((IRentable) v).calculateRent(days);
                System.out.println("Total Rent: ₹" + rent);
            }
        }
    }
}
