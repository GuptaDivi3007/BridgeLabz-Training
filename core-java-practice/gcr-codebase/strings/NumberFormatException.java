import java.util.*;

public class CompareTwoLowercase {

    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        }
        catch (RuntimeException e) {
            System.out.println("Error occurred");
        }

        handleException(text);
    }
}
