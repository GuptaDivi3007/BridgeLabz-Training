import java.util.*;

public class IllegalArgumentException {

    static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid arguments used");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime issue occurred");
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
