package LinkedList;
class Book {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;
    Book prev, next;

    public Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
public class LibraryManagementSystem {
	static Book head = null;
    static Book tail = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addAtBeginning(101, "The Alchemist", "Paulo Coelho", "Fiction", true);
        addAtEnd(102, "Java Programming", "James Gosling", "Education", true);
        addAtPosition(2, 103, "1984", "George Orwell", "Dystopia", false);

        displayForward();
        System.out.println();

        System.out.println("Searching by Title:");
        searchByTitle("1984");
        System.out.println();

        System.out.println("Updating Availability:");
        updateStatus(103, true);
        searchByTitle("1984");
        System.out.println();

        System.out.println("Books in Reverse:");
        displayReverse();
        System.out.println();

        countBooks();
        System.out.println();

        System.out.println("Removing Book ID 102...");
        removeById(102);
        displayForward();
        countBooks();
	}
	public static void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        Book newBook = new Book(id, title, author, genre, status);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

   
    public static void addAtEnd(int id, String title, String author, String genre, boolean status) {
        Book newBook = new Book(id, title, author, genre, status);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    
    public static void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
        if (pos <= 1) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }

        Book newBook = new Book(id, title, author, genre, status);
        Book temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, status);
            return;
        }

        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
    }

   
    public static void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty!");
            return;
        }

        Book temp = head;

       
        if (temp.bookId == id) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Book removed successfully!");
            return;
        }

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found!");
            return;
        }

        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully!");
    }

    
    public static void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBookDetails(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No book found with title: " + title);
    }

    
    public static void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBookDetails(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No book found by author: " + author);
    }

    
    public static void updateStatus(int id, boolean status) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Status updated successfully!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book ID not found!");
    }

   
    public static void displayForward() {
        if (head == null) {
            System.out.println("Library is empty!");
            return;
        }

        Book temp = head;
        System.out.println("Books in Forward Order:");
        while (temp != null) {
            printBookDetails(temp);
            temp = temp.next;
        }
    }

   
    public static void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty!");
            return;
        }

        Book temp = tail;
        System.out.println("Books in Reverse Order:");
        while (temp != null) {
            printBookDetails(temp);
            temp = temp.prev;
        }
    }

   
    public static void countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books in Library: " + count);
    }

    
    public static void printBookDetails(Book b) {
        System.out.println("ID: " + b.bookId +
                ", Title: " + b.title +
                ", Author: " + b.author +
                ", Genre: " + b.genre +
                ", Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}
