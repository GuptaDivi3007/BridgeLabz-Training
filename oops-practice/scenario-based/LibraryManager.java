import java.util.*;

public class LibraryManager {

    static class Book {
        String title;
        String author;
        boolean available;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.available = true;
        }
    }

    static void displayBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(
                (i + 1) + ". " +
                books[i].title + " | " +
                books[i].author + " | " +
                (books[i].available ? "Available" : "Checked Out")
            );
        }
    }

    static void searchByTitle(Book[] books, String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book.title + " by " + book.author + " | " +
                        (book.available ? "Available" : "Checked Out"));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found");
        }
    }

    static void checkoutBook(Book[] books, int index) {
        if (index < 0 || index >= books.length) {
            System.out.println("Invalid book selection");
            return;
        }

        if (books[index].available) {
            books[index].available = false;
            System.out.println("Book checked out successfully");
        }
        else {
            System.out.println("Book already checked out");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = Integer.parseInt(sc.nextLine());

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            books[i] = new Book(title, author);
        }

        while (true) {
            System.out.println("\n1. Display Books");
            System.out.println("2. Search by Title");
            System.out.println("3. Checkout Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                displayBooks(books);
            }
            else if (choice == 2) {
                System.out.print("Enter title keyword: ");
                searchByTitle(books, sc.nextLine());
            }
            else if (choice == 3) {
                displayBooks(books);
                System.out.print("Select book number: ");
                checkoutBook(books, Integer.parseInt(sc.nextLine()) - 1);
            }
            else if (choice == 4) {
                break;
            }
        }
    }
}
