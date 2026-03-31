import java.util.*;

public class Product {

    static int totalProducts = 0;

    String productName;
    double price;

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10.0);
        Product p2 = new Product("Notebook", 50.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        displayTotalProducts();
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
