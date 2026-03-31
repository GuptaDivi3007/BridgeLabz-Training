import java.util.*;

public class LengthOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int manualLen = findLength(text);
        int builtInLen = text.length();

        System.out.println("Manual length: " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
    }

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (RuntimeException e) {
            return count;
        }
    }
}
