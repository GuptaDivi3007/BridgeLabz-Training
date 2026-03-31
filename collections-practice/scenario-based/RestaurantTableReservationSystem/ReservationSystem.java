import java.time.LocalDateTime;
import java.util.*;

public class ReservationSystem {

	private Map<Integer, Table> tables = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    public ReservationSystem() {
        tables.put(1, new Table(1, 2));
        tables.put(2, new Table(2, 4));
        tables.put(3, new Table(3, 6));
    }

    public void reserveTable(int tableNumber, String customerName, LocalDateTime timeSlot) throws TableAlreadyReservedException {
        if (!tables.containsKey(tableNumber)) {
            System.out.println("Table does not exist!");
            return;
        }
        
        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber && r.getTimeSlot().equals(timeSlot)) {
                throw new TableAlreadyReservedException("Table " + tableNumber + " is already reserved for this time.");
            }
        }

        reservations.add(new Reservation(tableNumber, customerName, timeSlot));
        System.out.println("Reservation successful for Table " + tableNumber + " at " + timeSlot);
    }

    public void cancelReservation(int tableNumber, LocalDateTime timeSlot) {
        Iterator<Reservation> itr = reservations.iterator();
        while (itr.hasNext()) {
            Reservation r = itr.next();
            if (r.getTableNumber() == tableNumber && r.getTimeSlot().equals(timeSlot)) {
                itr.remove();
                System.out.println("Reservation cancelled successfully.");
                return;
            }
        }
        System.out.println("No matching reservation found.");
    }

    public void showAvailableTables(LocalDateTime timeSlot) {
        System.out.println("Available tables at " + timeSlot + ":");
        for (Table t : tables.values()) {
            boolean booked = false;
            for (Reservation r : reservations) {
                if (r.getTableNumber() == t.getTableNumber() && r.getTimeSlot().equals(timeSlot)) {
                    booked = true;
                    break;
                }
            }
            if (!booked) System.out.println(t);
        }
    }
}
