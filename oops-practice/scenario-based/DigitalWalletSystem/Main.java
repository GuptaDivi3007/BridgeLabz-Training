public class Main {

	public static void main(String[] args) {

		try {
            User u1 = new User("U101", "Alice", 1000);
            User u2 = new User("U102", "Bob", 500);

            u1.getWallet().addMoney(500);
            u2.getWallet().withdrawMoney(200);

            TransferService transfer = new WalletTransfer();
            transfer.transfer(u1, u2, 300);

            System.out.println("Alice Balance: " + u1.getWallet().getBalance());
            System.out.println("Bob Balance: " + u2.getWallet().getBalance());
           
            System.out.println("\nAlice Transactions:");
            u1.getWallet().getTransactions().forEach(System.out::println);

            System.out.println("\nBob Transactions:");
            u2.getWallet().getTransactions().forEach(System.out::println);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
