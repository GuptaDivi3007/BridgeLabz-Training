package smartLibraryManagementSystem;

public class FacultyReservationStrategy implements ReservationStrategy {
    public boolean canReserve(int currentReservations) {
        return currentReservations < 5;
    }
}
