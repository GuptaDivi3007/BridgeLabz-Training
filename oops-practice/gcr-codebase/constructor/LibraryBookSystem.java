import java.util.*;

public class LibraryBookSystem {

    public static void main(String[] args) {
        Book book = new Book("Wings Of Fire", "A.P.J Abdul Kalam", 450.0, true);
        book.borrowBook();
    }
}

public class Book {
    String title;
    String author;
    double price;
    boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
        }
    }
}
