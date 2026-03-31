import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private Guest guest;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private PricingStrategy pricingStrategy;

    public Reservation(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, PricingStrategy pricingStrategy) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pricingStrategy = pricingStrategy;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public double generateInvoice() {
        long days = ChronoUnit.DAYS.between(checkIn, checkOut);
        return pricingStrategy.calculate(room.getBasePrice()) * days;
    }
}
