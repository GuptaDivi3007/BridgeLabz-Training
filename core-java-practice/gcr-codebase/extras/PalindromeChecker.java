import java.util.*;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isPalindrome(str);
        displayResult(ans);
    }

    public static boolean isPalindrome(String value) {
        int start = 0;
        int end = value.length() - 1;

        while (start < end) {
            if (value.charAt(start) != value.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void displayResult(boolean status) {
        System.out.println(status);
    }
}
