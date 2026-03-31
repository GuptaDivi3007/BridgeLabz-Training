import java.util.*;

public class InvoiceGenerator {

    static String[] parseInvoice(String str) {
        return str.split(",");
    }

    static double getTotalAmount(String[] tasks) {
        double total = 0;
        for (String task : tasks) {
            String[] parts = task.trim().split("-");
            if (parts.length == 2) {
                String amountPart = parts[1].trim().split(" ")[0];
                total += Double.parseDouble(amountPart);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter invoice details:");
        String str = sc.nextLine();

        String[] tasks = parseInvoice(str);

        for (String task : tasks) {
            String[] parts = task.trim().split("-");
            String taskName = parts[0].trim();
            String amount = parts[1].trim();
            System.out.println("Task: " + taskName + " | Amount: " + amount);
        }

        double total = getTotalAmount(tasks);
        System.out.println("Total Invoice Amount: " + total + " INR");
    }
}
