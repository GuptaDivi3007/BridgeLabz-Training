import java.time.LocalDateTime;
public class Main {

	public static void main(String[] args) {

		ReservationSystem system = new ReservationSystem();

        LocalDateTime slot = LocalDateTime.of(2026, 1, 28, 19, 0);

        system.showAvailableTables(slot);

        try {
            system.reserveTable(1, "Khushi", slot);
            system.reserveTable(1, "Riya", slot); // should throw exception
        }
        catch (TableAlreadyReservedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        system.showAvailableTables(slot);

        system.cancelReservation(1, slot);

        system.showAvailableTables(slot);
	}
}
