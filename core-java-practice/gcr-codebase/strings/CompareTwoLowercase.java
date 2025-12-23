import java.util.*;

public class CompareTwoLowercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manualLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        boolean same = compare(manualLower, builtInLower);

        System.out.println(manualLower);
        System.out.println(same ? "Both matched" : "Not matched");
    }

    static String convertToLower(String text) {
        String ans = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ans += (char) (ch + 32);
            }
            else {
                ans += ch;
            }
        }
        return ans;
    }

    static boolean compare(String a, String b) {
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
