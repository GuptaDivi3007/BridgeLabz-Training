import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 999.99, 1);

        item.showItem();
        item.addItem(2);
        item.removeItem(1);
        item.showTotalCost();
    }
}

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int count) {
        quantity += count;
        System.out.println("Added " + count + " of " + itemName + " to the cart.");
    }

    void removeItem(int count) {
        if (quantity >= count) {
            quantity -= count;
            System.out.println("Removed " + count + " of " + itemName + " from the cart.");
        }
    }

    void showItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }

    void showTotalCost() {
        System.out.println("Total cost: $" + (price * quantity));
    }
}
