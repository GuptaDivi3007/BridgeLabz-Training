public class Booking{

    private String passengerName;
    private Flight flight;

    public Booking(String passengerName, Flight flight){
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void displayBooking(){
        System.out.println("Passenger: " + passengerName + " | Flight: " + flight.source + " -> " + flight.destination);
    }
}