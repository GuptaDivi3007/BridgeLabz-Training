import java.util.*;

class Item {
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;

    public Item(int id, String name, int quantity, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    static Item head = null;

	public static void main(String[] args) {

		addAtBeginning(101, "Mouse", 20, 499.99);
        addAtEnd(102, "Keyboard", 10, 999.49);
        addAtPosition(2, 103, "Monitor", 5, 7999.99);
        System.out.println("Inventory Items:");
        displayAll();

        System.out.println("Updating Quantity of ID 101 to 50:");
        updateQuantity(101, 50);
        searchById(101);

        System.out.println("Searching by Name 'Monitor':");
        searchByName("Monitor");

        System.out.println("Total Inventory Value:");
        calculateTotalValue();

        System.out.println("Sorting by Price ASC:");
        sortInventory("price", true);
        displayAll();

        System.out.println("Removing Item ID 102:");
        removeById(102);
        displayAll();
	}

	public static void addAtBeginning(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public static void addAtEnd(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }
    
    public static void addAtPosition(int pos, int id, String name, int quantity, double price) {
        if (pos <= 1) {
            addAtBeginning(id, name, quantity, price);
            return;
        }
        Item newItem = new Item(id, name, quantity, price);
        Item temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            addAtEnd(id, name, quantity, price);
        }
        else {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }
    
    public static void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty!");
            return;
        }
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found!");
        }
        else {
            temp.next = temp.next.next;
        }
    }
    
    public static Item mergeSort(Item head, String sortBy, boolean ascending) {
        if (head == null || head.next == null) {
            return head;
        }

        Item mid = getMiddle(head);
        Item nextOfMid = mid.next;
        mid.next = null;

        Item left = mergeSort(head, sortBy, ascending);
        Item right = mergeSort(nextOfMid, sortBy, ascending);

        return sortedMerge(left, right, sortBy, ascending);
    }

    public static Item sortedMerge(Item a, Item b, String sortBy, boolean ascending) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        boolean compare;
        if (sortBy.equalsIgnoreCase("name")) {
            compare = a.itemName.compareToIgnoreCase(b.itemName) < 0;
        }
        else {
            compare = a.price < b.price;
        }

        if (!ascending) {
            compare = !compare;
        }

        Item result;
        if (compare) {
            result = a;
            result.next = sortedMerge(a.next, b, sortBy, ascending);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next, sortBy, ascending);
        }
        return result;
    }

    public static Item getMiddle(Item head) {
        if (head == null) {
            return head;
        }
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
   
    public static void sortInventory(String sortBy, boolean ascending) {
        if (sortBy.equalsIgnoreCase("name") || sortBy.equalsIgnoreCase("price")) {
            head = mergeSort(head, sortBy, ascending);
        }
        else {
            System.out.println("Invalid sort criteria!");
        }
    }

    public static void displayAll() {
        Item temp = head;
        if (temp == null) {
            System.out.println("Inventory is empty!");
            return;
        }
        while (temp != null) {
            System.out.println("ID: " + temp.itemId +
                    ", Name: " + temp.itemName +
                    ", Qty: " + temp.quantity +
                    ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    public static void updateQuantity(int id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found!");
    }
    
    public static void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Found -> ID: " + temp.itemId + ", Name: " + temp.itemName +
                        ", Qty: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }
   
    public static void searchByName(String name) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                System.out.println("Found -> ID: " + temp.itemId + ", Name: " + temp.itemName +
                        ", Qty: " + temp.quantity + ", Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    public static void calculateTotalValue() {
        Item temp = head;
        double total = 0;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value = " + total);
    }
}
