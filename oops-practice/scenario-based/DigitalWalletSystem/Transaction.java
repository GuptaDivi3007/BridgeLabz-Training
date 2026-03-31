import java.time.LocalDateTime;

public class Transaction {
    
	private String type;
    private double amount;
    private String description;
    private LocalDateTime time;

    public Transaction(String type, double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.time = LocalDateTime.now();
    }

    public String toString() {
        return time + " | " + type + " | " + amount + " | " + description;
    }
}
