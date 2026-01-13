import java.util.*;

public class FlightBookingApp{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Flight[] flights = {
            new Flight(101, "Delhi", "Mumbai", 5),
            new Flight(102, "Delhi", "Bangalore", 3),
            new Flight(103, "Mumbai", "Chennai", 4)
        };

        FlightServices service = new FlightServices(flights);

        while(true) {
            System.out.println("\n1.Search Flight\n2.Book Flight\n3.View Bookings\n4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter Source: ");
                    String src = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    service.searchFlight(src, dest);
                }

                case 2 -> {
                    System.out.print("Enter Flight ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    service.bookFlight(id, name);
                }

                case 3 -> service.viewBookings();

                case 4 -> System.exit(0);
            }
        }
    }
}