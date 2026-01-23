import java.util.*;

class WithdrawalRequest {
    String accountNumber;
    int amount;

    WithdrawalRequest(String accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("ACC101", 5000);
        accounts.put("ACC102", 8000);
        accounts.put("ACC103", 3000);

        TreeMap<Integer, String> sortedByBalance = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : accounts.entrySet()) {
            sortedByBalance.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Accounts Sorted By Balance: " + sortedByBalance);

        Queue<WithdrawalRequest> queue = new LinkedList<>();
        queue.add(new WithdrawalRequest("ACC101", 1000));
        queue.add(new WithdrawalRequest("ACC102", 2000));

        while (!queue.isEmpty()) {
            WithdrawalRequest req = queue.poll();
            int balance = accounts.get(req.accountNumber);

            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal successful for " + req.accountNumber);
            } else {
                System.out.println("Insufficient balance for " + req.accountNumber);
            }
        }

        System.out.println("Updated Accounts: " + accounts);
    }
}