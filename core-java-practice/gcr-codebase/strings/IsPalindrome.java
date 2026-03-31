import java.util.*;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        boolean ans1 = isPalindromeLoop(text);
        boolean ans2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean ans3 = isPalindromeUsingArray(text);

        System.out.println("Using Loop: " + ans1);
        System.out.println("Using Recursion: " + ans2);
        System.out.println("Using Array: " + ans3);
    }

    static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
}
