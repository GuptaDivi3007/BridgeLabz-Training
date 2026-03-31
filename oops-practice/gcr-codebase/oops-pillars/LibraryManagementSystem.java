import java.util.*;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean available = true;
    private String borrower;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    String getItemId() {
        return itemId;
    }

    boolean isAvailable() {
        return available;
    }

    void markReserved(String borrowerName) {
        available = false;
        borrower = borrowerName;
    }

    void markReturned() {
        available = true;
        borrower = null;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Status: " + (available ? "Available" : "Reserved"));
    }
}

class Book extends LibraryItem implements Reservable {

    Book(String id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            markReserved(borrowerName);
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {

    Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            markReserved(borrowerName);
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {

    DVD(String id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            markReserved(borrowerName);
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        LibraryItem b1 = new Book("B101", "Effective Java", "Joshua Bloch");
        LibraryItem m1 = new Magazine("M202", "Tech Today", "Editorial Team");
        LibraryItem d1 = new DVD("D303", "Inception", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        ((Reservable) b1).reserveItem("Rohan");

        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                System.out.println("Can Reserve: " + ((Reservable) item).checkAvailability());
            }
            System.out.println("----------------------");
        }
    }
}
