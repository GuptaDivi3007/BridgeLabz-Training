public class Main {

	public static void main(String[] args) {

		AlertService alertService = new EmailAlertService();
        Inventory inventory = new Inventory(alertService);

        Product p1 = new Product("P101", "Mouse", 10);
        Product p2 = new Product("P102", "Keyboard", 4);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        try {
            inventory.sellProduct("P101", 6);
            inventory.sellProduct("P102", 2);
            inventory.sellProduct("P102", 3); 
        }
        catch (OutOfStockException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
	}
}
