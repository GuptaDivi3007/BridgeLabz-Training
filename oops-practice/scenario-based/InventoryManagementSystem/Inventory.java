import java.util.*;

public class Inventory {
    
	private HashMap<String, Product> products = new HashMap<>();
    private AlertService alertService;
    private final int LOW_STOCK_THRESHOLD = 5;

    public Inventory(AlertService alertService) {
        this.alertService = alertService;
    }

    public void addProduct(Product p) {
        products.put(p.getProductId(), p);
        System.out.println("Product added: " + p.getName());
    }

    public void updateStock(String productId, int qty) {
        Product p = products.get(productId);
        if (p != null) {
            p.addStock(qty);
            System.out.println("Stock updated for: " + p.getName());
        }
    }

    public void sellProduct(String productId, int qty) throws OutOfStockException {
        Product p = products.get(productId);
        if (p != null) {
            p.removeStock(qty);
            System.out.println("Sold " + qty + " of " + p.getName());
            checkLowStock(p);
        }
    }

    private void checkLowStock(Product p) {
        if (p.getQuantity() <= LOW_STOCK_THRESHOLD) {
            alertService.sendAlert("Low stock alert for: " + p.getName() + 
                                   " | Remaining: " + p.getQuantity());
        }
    }
}
