import java.util.*;

public class CheckPalindromeString {

    public static void main(String[] args) {
        PalindromeChecker first = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker second = new PalindromeChecker("Hello");

        first.showResult();
        second.showResult();
    }

    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    void showResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        }
        else {
            System.out.println(text + " is not Palindrome");
        }
    }
}
