import java.time.LocalDateTime;

public class Reservation {

	private int tableNumber;
    private String customerName;
    private LocalDateTime timeSlot;

    public Reservation(int tableNumber, String customerName, LocalDateTime timeSlot) {
        this.tableNumber = tableNumber;
        this.customerName = customerName;
        this.timeSlot = timeSlot;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDateTime getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Reservation: Table " + tableNumber + ", Customer: " + customerName + ", Time: " + timeSlot;
    }
}
