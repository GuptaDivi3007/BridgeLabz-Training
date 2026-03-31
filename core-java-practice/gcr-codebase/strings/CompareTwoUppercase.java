import java.util.*;

public class CompareTwoUppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manual = convertToUpper(text);
        String builtIn = text.toUpperCase();

        boolean same = compareStrings(manual, builtIn);

        System.out.println(manual);
        System.out.println(same ? "Both matched" : "Not matched");
    }

    static String convertToUpper(String text) {
        String ans = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans += (char) (ch - 32);
            }
            else {
                ans += ch;
            }
        }
        return ans;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
