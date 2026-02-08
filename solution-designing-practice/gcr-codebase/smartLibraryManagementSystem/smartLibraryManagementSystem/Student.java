package smartLibraryManagementSystem;

public class Student implements User {
    private String name;
    private int reservations = 0;
    private ReservationStrategy strategy = new StudentReservationStrategy();

    public Student(String name) {
        this.name = name;
    }
    public void showRole() {
        System.out.println(name + " is a Student.");
    }
    public boolean reserveBook() {
        if (strategy.canReserve(reservations)) {
            reservations++;
            System.out.println(name + " reserved book.");
            return true;
        }
        System.out.println(name + " cannot reserve more books.");
        return false;
    }
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
