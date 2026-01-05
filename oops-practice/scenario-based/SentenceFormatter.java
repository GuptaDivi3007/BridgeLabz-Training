import java.util.*;

public class SentenceFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(formatText(str));
    }

    public static String formatText(String str) {
        String cleaned = str.trim().replaceAll("\\s+", " ");
        StringBuilder ans = new StringBuilder();

        boolean capitalizeNext = true;

        for (int i = 0; i < cleaned.length(); i++) {
            char ch = cleaned.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                ans.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            }
            else {
                ans.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
                if (i + 1 < cleaned.length() && cleaned.charAt(i + 1) != ' ') {
                    ans.append(' ');
                }
            }
        }

        return ans.toString().replaceAll("\\s+", " ").trim();
    }
}
