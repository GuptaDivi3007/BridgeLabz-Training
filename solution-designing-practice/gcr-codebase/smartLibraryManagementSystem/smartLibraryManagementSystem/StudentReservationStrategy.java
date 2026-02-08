package smartLibraryManagementSystem;

public class StudentReservationStrategy implements ReservationStrategy {
    public boolean canReserve(int currentReservations) {
        return currentReservations < 2;
    }
}
