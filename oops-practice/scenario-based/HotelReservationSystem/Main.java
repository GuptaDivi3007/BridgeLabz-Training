import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		HotelService hotel = new HotelService();

        hotel.addRoom(new DeluxeRoom(101));
        hotel.addRoom(new StandardRoom(102));

        Guest g1 = new Guest("Ravi Sharma", "Aadhar123");

        PricingStrategy peak = new PeakSeasonPricing();

        try {
            Reservation r1 = hotel.bookRoom(g1, DeluxeRoom.class,
                    LocalDate.of(2026,1,10),
                    LocalDate.of(2026,1,13),
                    peak);

            hotel.checkOut(r1);

        }
        catch (RoomNotAvailableException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
	}
}
