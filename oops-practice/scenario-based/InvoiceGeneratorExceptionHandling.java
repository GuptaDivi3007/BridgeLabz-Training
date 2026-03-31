import java.util.*;

public class InvoiceGeneratorExceptionHandling {

    static class InvalidInvoiceFormatException extends Exception {
        InvalidInvoiceFormatException(String message) {
            super(message);
        }
    }

    static String[] parseInvoice(String str) throws InvalidInvoiceFormatException {
        if (str == null || str.trim().isEmpty()) {
            throw new InvalidInvoiceFormatException("Invoice str is empty");
        }
        return str.split(",");
    }

    static double getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        double total = 0;

        for (String task : tasks) {
            if (!task.contains("-")) {
                throw new InvalidInvoiceFormatException("Missing '-' in task: " + task);
            }

            String[] parts = task.split("-");
            if (parts.length < 2) {
                throw new InvalidInvoiceFormatException("Invalid task format: " + task);
            }

            String amountPart = parts[1].trim();
            String[] amountTokens = amountPart.split(" ");

            if (amountTokens.length == 0) {
                throw new InvalidInvoiceFormatException("Amount missing in task: " + task);
            }

            try {
                total += Double.parseDouble(amountTokens[0]);
            }
            catch (NumberFormatException e) {
                throw new InvalidInvoiceFormatException("Invalid amount in task: " + task);
            }
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter invoice details:");
        String str = sc.nextLine();

        try {
            String[] tasks = parseInvoice(str);

            for (String task : tasks) {
                String[] parts = task.split("-");
                System.out.println("Task: " + parts[0].trim() + " | Amount: " + parts[1].trim());
            }

            double total = getTotalAmount(tasks);
            System.out.println("Total Invoice Amount: " + total + " INR");

        }
        catch (InvalidInvoiceFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
