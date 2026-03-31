import java.util.*;

public class ATMSimulation {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("State of Chennai", "ACC001", 700.0);

        account.showBalance();
        account.deposit(200.0);
        account.showBalance();
        account.withdraw(100.0);
        account.showBalance();
        account.withdraw(900.0);
    }
}

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}
