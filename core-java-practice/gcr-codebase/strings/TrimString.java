import java.util.*;

public class TrimString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] points = trimPoints(text);
        String manualTrim = substringUsingCharAt(text, points[0], points[1]);
        String builtInTrim = text.trim();

        boolean same = compareStrings(manualTrim, builtInTrim);

        System.out.println(manualTrim);
        System.out.println(same ? "Both matched" : "Not matched");
    }

    static int[] trimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
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
