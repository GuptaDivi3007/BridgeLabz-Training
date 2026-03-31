import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    protected double price;

    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    String getProductId() {
        return productId;
    }

    String getName() {
        return name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {

    Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST";
    }
}

class Clothing extends Product implements Taxable {

    Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }

    public double calculateTax() {
        return price * 0.05;
    }

    public String getTaxDetails() {
        return "5% GST";
    }
}

class Groceries extends Product {

    Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.05;
    }
}

public class ECommercePlatform {

    static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }
            double finalPrice = p.price + tax - p.calculateDiscount();
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("E01", "Laptop", 60000));
        products.add(new Clothing("C01", "Jacket", 3000));
        products.add(new Groceries("G01", "Rice Bag", 1200));

        printFinalPrices(products);
    }
}
