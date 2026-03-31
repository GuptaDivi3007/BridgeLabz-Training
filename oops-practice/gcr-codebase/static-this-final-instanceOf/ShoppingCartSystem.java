import java.util.*;

public class ShoppingCartSystem {

    public static void main(String[] args) {
        Product.updateDiscount(10.0);

        Product p1 = new Product("P001", "Laptop", 1200.0, 5);
        Product p2 = new Product("P002", "Smartphone", 800.0, 10);

        if (p1 instanceof Product) {
            p1.showDetails();
        }

        System.out.println();

        if (p2 instanceof Product) {
            p2.showDetails();
        }
    }
}

class Product {

    static double discount = 0.0;

    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void showDetails() {
        double discountedPrice = price - (price * discount / 100);

        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price after Discount: $" + discountedPrice);
    }
}
