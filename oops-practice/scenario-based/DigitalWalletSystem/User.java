public class User {
    
	private String userId;
    private String name;
    private Wallet wallet;

    public User(String userId, String name, double initialBalance) {
        this.userId = userId;
        this.name = name;
        this.wallet = new Wallet(initialBalance);
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
