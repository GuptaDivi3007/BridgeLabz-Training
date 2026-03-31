public class Flight{

    private int flightId;
    private String source;
    private String destination;
    private int availableSeats;

    public Flight(int flightId, String source, String destination, int availableSeats){
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public void displayFlight(){
        System.out.println(flightId + " | " + source + " -> " + destination + " | Seats: " + availableSeats);
    }
}