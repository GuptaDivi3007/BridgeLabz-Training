import java.util.*;

public class MovieTicketBookingSystem {

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.showDetails();
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.showDetails();
    }
}

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean booked = false;

    void bookTicket(String movieName, String seatNumber, double price) {
        if (booked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
            return;
        }
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        booked = true;
        System.out.println("Ticket booked for movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    void showDetails() {
        if (!booked) {
            System.out.println("Ticket have not booked yet....");
        }
        else {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }
}
