import java.util.*;

public class Main {

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", "George Orwell", "1984");
        shelf.addBook("Fiction", "George Orwell", "Animal Farm");
        shelf.addBook("Science", "Stephen Hawking", "A Brief History of Time");
        shelf.addBook("Fiction", "George Orwell", "1984");

        shelf.printCatalog();

        shelf.borrowBook("Fiction", "1984");
        shelf.printCatalog();

        shelf.returnBook("Fiction", "1984", "George Orwell");
        shelf.printCatalog();
    }
}
