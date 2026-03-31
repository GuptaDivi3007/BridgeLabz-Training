import java.util.*;

public class OnlineBankingSystem {

    public static void main(String[] args) {

        Account savings = new SavingsAccount(101, "Divyanshi", 10000);
        Account current = new CurrentAccount(102, "Amit", 5000);

        BankService bankService = new BankServiceImpl();

        try {
            bankService.transfer(savings, current, 3000);
            bankService.transfer(savings, current, 2000);
            bankService.transfer(savings, current, 1000);
        }
        catch (InsufficientBalanceException e) {

        }
    }

    public static abstract class Account {
        public int accountNumber;
        public String accountHolder;
        public double balance;
        public List<String> transactionHistory;

        public Account(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.transactionHistory = new ArrayList<>();
        }

        public void deposit(double amount) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        }

        public void withdraw(double amount)
                throws InsufficientBalanceException {

            if (balance < amount) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
        }

        public double getBalance() {
            return balance;
        }

        public abstract double calculateInterest();
    }

    public static class SavingsAccount extends Account {

        public SavingsAccount(int accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        public double calculateInterest() {
            return balance * 0.04;
        }
    }

    public static class CurrentAccount extends Account {

        public CurrentAccount(int accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        public double calculateInterest() {
            return balance * 0.02;
        }
    }

    // abstraction
    public interface BankService {
        public void transfer(Account from, Account to, double amount) throws InsufficientBalanceException;
    }

    // implementation
    public static class BankServiceImpl implements BankService {

        public void transfer(Account from, Account to, double amount)
                throws InsufficientBalanceException {

            from.withdraw(amount);
            to.deposit(amount);

            from.transactionHistory.add(
                    "Transferred " + amount + " to Account " + to.accountNumber);

            to.transactionHistory.add(
                    "Received " + amount + " from Account " + from.accountNumber);
        }
    }

    public static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }
}
