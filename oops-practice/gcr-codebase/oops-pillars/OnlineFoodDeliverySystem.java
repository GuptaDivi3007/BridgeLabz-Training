import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    protected double price;
    protected int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    String getItemName() {
        return itemName;
    }

    int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
    }
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    double calculateTotalPrice() {
        return price * quantity - applyDiscount();
    }

    public double applyDiscount() {
        return price * quantity * 0.10;
    }

    public String getDiscountDetails() {
        return "10% Veg Discount Applied";
    }
}

class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    double calculateTotalPrice() {
        double extraCharge = price * quantity * 0.15;
        return price * quantity + extraCharge - applyDiscount();
    }

    public double applyDiscount() {
        return price * quantity * 0.05;
    }

    public String getDiscountDetails() {
        return "5% Non-Veg Discount Applied";
    }
}

public class OnlineFoodDeliverySystem {

    static void processOrder(List<FoodItem> items) {
        double grandTotal = 0;

        for (FoodItem item : items) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }

            grandTotal += total;
            System.out.println("-----------------------");
        }

        System.out.println("Grand Total: " + grandTotal);
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Rice", 120, 2));
        order.add(new NonVegItem("Chicken Biryani", 200, 1));

        processOrder(order);
    }
}
