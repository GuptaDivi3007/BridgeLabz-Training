import java.util.*;

public class StringIndexOutOfBoundException {

    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // invalid index
    }
   
    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("SIOBE handled safely.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred while accessing string.");
        }

        handleException(text);
    }
}
