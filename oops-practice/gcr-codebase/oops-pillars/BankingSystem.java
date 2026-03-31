import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getHolderName() {
        return holderName;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double requestedLoan;

    SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan(double amount) {
        requestedLoan = amount;
    }

    public boolean calculateLoanEligibility() {
        return balance >= requestedLoan * 0.5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double requestedLoan;

    CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() {
        return balance * 0.02;
    }

    public void applyForLoan(double amount) {
        requestedLoan = amount;
    }

    public boolean calculateLoanEligibility() {
        return balance >= requestedLoan;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount s1 = new SavingsAccount("SA101", "Thamarai", 50000);
        CurrentAccount c1 = new CurrentAccount("CA202", "Rohan", 80000);

        s1.applyForLoan(20000);
        c1.applyForLoan(60000);

        accounts.add(s1);
        accounts.add(c1);

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                System.out.println("Loan Eligible: " + ((Loanable) acc).calculateLoanEligibility());
            }
            System.out.println("--------------------");
        }
    }
}
