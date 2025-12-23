import java.util.*;

public class CompareTwoSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string: ");
        String text = sc.next();
        System.out.print("first index: ");
        int first = sc.nextInt();
        System.out.print("last index: ");
        int last = sc.nextInt();

        String manualAns = substringUsingCharAt(text, first, last);
        String builtInAns = text.substring(first, last);

        boolean isSame = compare(manualAns, builtInAns);

        System.out.println("Substring using charAt(): " + manualAns);
        System.out.println("Substring using substring(): " + builtInAns);
        System.out.println("Are both substrings same? " + isSame);
    }

    static String substringUsingCharAt(String text, int first, int last) {
        String ans = "";

        for (int i = first; i < last; i++) {
            ans += text.charAt(i);
        }
        return ans;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
