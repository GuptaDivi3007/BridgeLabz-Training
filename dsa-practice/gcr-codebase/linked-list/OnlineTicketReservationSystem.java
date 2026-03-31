import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        this.next = this; 
    }
}

public class OnlineTicketReservationSystem {

    static Ticket head = null;
    
    public static void addTicket(int ticketId, String customerName, String movieName, String seatNumber) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber);

        if (head == null) {
            head = newTicket;
            System.out.println("Ticket added successfully!");
            return;
        }

        Ticket temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTicket;
        newTicket.next = head;
        System.out.println("Ticket added successfully!");
    }
   
    public static void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available to remove!");
            return;
        }

        Ticket current = head;
        Ticket prev = null;

        do {
            if (current.ticketId == ticketId) {
                if (prev == null) {
                    if (head.next == head) {
                        head = null;
                    }
                    else {
                        Ticket last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    }
                }
                else {
                    prev.next = current.next;
                }

                System.out.println("Ticket with ID " + ticketId + " removed successfully!");
                return;
            }

            prev = current;
            current = current.next;
        }
        while (current != head);

        System.out.println("Ticket with ID " + ticketId + " not found!");
    }

    public static void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet!");
            return;
        }

        Ticket temp = head;
        System.out.println("Current Ticket Reservations:");
        do {
            System.out.println("------------------------------------");
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie Name: " + temp.movieName);
            System.out.println("Seat Number: " + temp.seatNumber);
            System.out.println("Booking Time: " + temp.bookingTime);
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("------------------------------------");
    }
   
    public static void searchTicket(String key) {
        if (head == null) {
            System.out.println("No tickets booked yet!");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) || temp.movieName.equalsIgnoreCase(key)) {
                System.out.println("Ticket Found:");
                System.out.println("Ticket ID: " + temp.ticketId);
                System.out.println("Customer Name: " + temp.customerName);
                System.out.println("Movie Name: " + temp.movieName);
                System.out.println("Seat Number: " + temp.seatNumber);
                System.out.println("Booking Time: " + temp.bookingTime);
                System.out.println("------------------------------------");
                found = true;
            }
            temp = temp.next;
        }
        while (temp != head);

        if (!found) {
            System.out.println("No ticket found for search key: " + key);
        }
    }
    
    public static int countTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        }
        while (temp != head);

        return count;
    }

    public static void main(String[] args) {
        
        addTicket(101, "Alice", "Avatar 2", "A12");
        addTicket(102, "Bob", "Avatar 2", "A13");
        addTicket(103, "Charlie", "Batman", "B07");

        displayTickets();

        System.out.println("Total Tickets Booked: " + countTickets());

        System.out.println("\nSearching for 'Avatar 2':");
        searchTicket("Avatar 2");

        System.out.println("\nRemoving Ticket with ID 102");
        removeTicket(102);

        displayTickets();
        System.out.println("Total Tickets Booked: " + countTickets());
    }
}
