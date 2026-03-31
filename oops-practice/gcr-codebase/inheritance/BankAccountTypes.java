import java.util.*;

public class BankAccountTypes {

    public static void main(String[] args) {
        BankAccount s = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount c = new CheckingAccount("CA202", 30000, 10000);
        BankAccount f = new FixedDepositAccount("FD303", 100000, 3);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureYears;

    FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account with Tenure: " + tenureYears + " years");
    }
}
