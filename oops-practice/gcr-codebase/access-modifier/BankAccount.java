import java.util.*;

public class BankAccount {

    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("ACC1001", "Ramesh", 5000.0, 4.5);
        savings.showAccountDetails();
        savings.setBalance(6500.0);
        savings.showAccountDetails();
    }
}
public class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}
