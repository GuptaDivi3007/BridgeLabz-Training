public class Main {

	public static void main(String[] args) {

		try {
            Product p1 = new Product(1, "Laptop", 55000, 5);
            Product p2 = new Product(2, "Mouse", 700, 20);
           
            Customer c1 = new Customer(10, "Khushi", "Agra");
           
            Order order = new Order(c1);
            order.addItem(p1, 1);
            order.addItem(p2, 2);

            Payment payment = new CardPayment(); 

            order.processOrder(payment);
        }
        
        catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
	}
}
