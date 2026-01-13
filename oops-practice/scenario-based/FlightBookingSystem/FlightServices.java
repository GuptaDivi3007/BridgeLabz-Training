import java.util.*;

public class FlightServices{

    private Flight[] flights;
    private List<Booking> bookings = new ArrayList<>();

    public FlightServices(Flight[] flights){
        this.flights = flights;
    }

    public void searchflight(String src, String dest){

        boolean found = false;
        for(Flight f : flights){
            if(f.source.equalsIgnoreCase(src) && f.destination.equalsIgnoreCase(dest)){
                f.displayFlight();
                found = true;
            }
        }
        if(!found){
            System.out.println("Sorry!...No flights found");
        }
    }

    public void bookFlight(int flightId, String passengerName){

        for(Flight f : flights){
            if(f.flightId == flightId && f.availableSeats > 0){
                bookings.add(new Booking(passengerName, f));
                f.availableSeats--;
                System.out.println("Booking successful");
                return;
            }
        }
        System.out.println("Flight not available or seats full");
    }

    public void viewBookings(){
        if(bookings.isEmpty()){
            System.out.println("No bookings yet");
            return;
        }
        for(Booking b : bookings){
            b.displayBooking();
        }
    }
}