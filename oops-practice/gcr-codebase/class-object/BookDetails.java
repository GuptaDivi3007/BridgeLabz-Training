import java.util.*;

public class BookDetails {

    public static void main(String[] args) {
        Book first = new Book("2States", "Chetan Bhagat", 500.0);
        Book second = new Book("Wings Of Fire", "Abdul kalam.A.P.J", 500.0);

        first.display();
        second.display();
    }
}

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }
}
