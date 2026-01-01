import java.util.*;

public class LibraryManagement {

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        Book.displayLibraryName();

        if (book instanceof Book) {
            book.displayDetails();
        }
    }
}

class Book {

    static String libraryName = "Egmore Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
