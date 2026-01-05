import java.util.*;

public class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, bal);

        account.checkBalance();
        account.deposit(500);
        account.checkBalance();
        account.withdraw(300);
        account.checkBalance();
        account.withdraw(1000);
    }
}
