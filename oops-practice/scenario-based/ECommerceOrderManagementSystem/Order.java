import java.util.*;

public class Order {

	private int orderId;
    private Customer customer;
    private List<OrderItem> items;
    private double totalAmount;
    private String status;

    public Order(Customer customer) {
    	this.customer = customer;
        this.items = new ArrayList<>();
        this.status = "CREATED";
    }

    public void addItem(Product product, int quantity) {
    	if(product.getStock() > 0) {
    		items.add(new OrderItem(product, quantity));
    		System.out.println("Your product " + product.getProductName() + " with quantity " + quantity + " is added in the cart");
    	}
    	else {
    		System.out.println("Soory! the product is out of stock");
    	}
    }

    public void calculateTotal() {
        totalAmount = 0;
        for (OrderItem item : items) {
            totalAmount += item.getItemTotal();
        }
    }

    public void cancelOrder() {
    	if(status.equals("BOOKED")) {
    		status = "CANCELLED";
    		for(OrderItem item : items) {
        		item.product.increaseStock(item.quantity);
        	}
        	System.out.println("Order " + orderId + " is cancelled ");
    	}
    	else {
    		System.out.println("Order cannot be cancelled at this stage.");
    	}
    }
    
    public boolean processOrder(Payment payment) throws PaymentFailedException {
        calculateTotal();
        System.out.println("Total Amount: ₹" + totalAmount);

        if (!payment.pay(totalAmount)) {
            throw new PaymentFailedException("Payment Failed! Order not placed.");
        }

        status = "BOOKED";
        System.out.println("Order " + orderId + " placed successfully!");
        return true;
    }
}
