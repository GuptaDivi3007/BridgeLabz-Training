public class Product {

	private String productId;
    private String name;
    private int quantity;

    public Product(String productId, String name, int quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int qty) {
        this.quantity += qty;
    }

    public void removeStock(int qty) throws OutOfStockException {
        if (qty > quantity) {
            throw new OutOfStockException("Not enough stock for " + name);
        }
        this.quantity -= qty;
    }
}
