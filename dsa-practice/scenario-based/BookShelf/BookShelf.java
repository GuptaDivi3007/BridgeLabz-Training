import java.util.*;

public class BookShelf {

    private Map<String, LinkedList<Book>> catalog;
    private Set<String> uniqueBooks;

    public BookShelf() {
        catalog = new HashMap<>();
        uniqueBooks = new HashSet<>();
    }

    public void addBook(String genre, String author, String title) {
        if (uniqueBooks.contains(title)) {
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(title, author));
        uniqueBooks.add(title);
    }

    public void borrowBook(String genre, String title) {
        LinkedList<Book> books = catalog.get(genre);
        if (books == null) {
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                uniqueBooks.remove(title);
                return;
            }
        }
    }

    public void returnBook(String genre, String title, String author) {
        addBook(genre, author, title);
    }

    public void printCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.print(genre + ": ");
            for (Book b : catalog.get(genre)) {
                System.out.print(b.title + " | ");
            }
            System.out.println();
        }
    }
}
