import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HotelService {
    
	private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Reservation bookRoom(Guest guest, Class<? extends Room> roomType,
                                LocalDate checkIn, LocalDate checkOut, PricingStrategy strategy)
                                throws RoomNotAvailableException {

        for (Room room : rooms) {
            if (roomType.isInstance(room) && room.isAvailable()) {
                room.setAvailable(false);
                Reservation res = new Reservation(guest, room, checkIn, checkOut, strategy);
                reservations.add(res);
                System.out.println("Room booked: " + room.getRoomNumber() + " for " + guest.getName());
                return res;
            }
        }
        throw new RoomNotAvailableException(roomType.getSimpleName() + " not available!");
    }

    public void checkOut(Reservation res) {
        res.getRoom().setAvailable(true);
        System.out.println("Checked out: Room " + res.getRoom().getRoomNumber());
        System.out.println("Total Bill: ₹" + res.generateInvoice());
    }
}
