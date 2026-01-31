import java.util.*;

public class FlipKeyLogicalProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = CleanseAndInvert(str);

        if (ans.isEmpty()) {
            System.out.println("Invalid Input");
        }
        else {
            System.out.println("The generated key is - " + ans);
        }
    }

    public static String CleanseAndInvert(String sc) {
        if (sc == null || sc.length() < 6) {
            return "";
        }

        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if (!Character.isLetter(ch)) {
                return "";
            }
        }

        String lowerText = sc.toLowerCase();
        StringBuilder filtered = new StringBuilder();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if ((int) ch % 2 != 0) {
                filtered.append(ch);
            }
        }

        filtered.reverse();

        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }
}
