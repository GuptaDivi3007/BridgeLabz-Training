package smartLibraryManagementSystem;

public class Guest implements User {
    private String name;
    private ReservationStrategy strategy = new GuestReservationStrategy();

    public Guest(String name) {
        this.name = name;
    }
    public void showRole() {
        System.out.println(name + " is a Guest.");
    }
    public boolean reserveBook() {
        System.out.println(name + " cannot reserve books.");
        return false;
    }
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
