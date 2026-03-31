import java.util.ArrayList;
import java.util.List;

public class Wallet {
    
	private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Wallet(double balance) {
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount, "Money Added"));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount, "Money Withdrawn"));
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
