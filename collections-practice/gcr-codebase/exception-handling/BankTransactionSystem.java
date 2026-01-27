import java.util.*;

public class BankTransactionSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        try {
            balance = withdraw(balance, withdrawAmount);
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }

    public static double withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        return balance - amount;
    }

    public static class InsufficientBalanceException extends Exception {
    }
}
