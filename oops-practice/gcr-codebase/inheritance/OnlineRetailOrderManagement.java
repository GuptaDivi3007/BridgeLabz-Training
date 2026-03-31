import java.util.*;

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {
        Order order = new Order("ORD101", "10-09-2025");
        ShippedOrder shipped = new ShippedOrder("ORD102", "11-09-2025", "TRK789");
        DeliveredOrder delivered = new DeliveredOrder("ORD103", "12-09-2025", "TRK456", "15-09-2025");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}
