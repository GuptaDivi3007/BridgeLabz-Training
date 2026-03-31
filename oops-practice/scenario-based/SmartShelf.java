import java.util.*;

public class SmartShelf {

	private List<String> shelf;

    public SmartShelf() {
        shelf = new ArrayList<>();
    }
   
    public void addBook(String title) {
        if (shelf.isEmpty()) {
            shelf.add(title);
            return;
        }

        int pos = Collections.binarySearch(shelf, title, String.CASE_INSENSITIVE_ORDER);
        
        if (pos < 0) {
            pos = -(pos + 1);
        }

        shelf.add(pos, title);
        System.out.println("Added: " + title + " at position " + pos);
    }

    public void printShelf() {
        System.out.println("Current Shelf: " + shelf);
    }

    public static void main(String[] args) {
        SmartShelf shelf = new SmartShelf();
        
        shelf.addBook("Data Structures");
        shelf.addBook("Algorithms");
        shelf.addBook("Computer Networks");
        shelf.addBook("Operating Systems");
        shelf.addBook("C Programming");
        
        shelf.printShelf();
    }
}
