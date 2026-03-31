import java.util.*;

public class CarRentalSystem {

    public static void main(String[] args) {
        CarRental rental = new CarRental("Suresh", "Swift", 5);
        rental.calculateCost();
    }
}

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500.0;

    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Basic";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * costPerDay;
    }
}
