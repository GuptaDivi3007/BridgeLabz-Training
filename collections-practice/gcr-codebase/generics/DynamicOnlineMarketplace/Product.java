public class Product<T extends ProductCategory> {

    private final String name;
    private double price;
    private final T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }
}
