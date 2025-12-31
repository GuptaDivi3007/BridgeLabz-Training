import java.util.*;

public class BookConstructorDemo {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("2States", "Chetan Bhagat", 500.0);
    }
}

public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
