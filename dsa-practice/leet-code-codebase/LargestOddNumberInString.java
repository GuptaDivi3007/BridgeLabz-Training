import java.util.*;

public class LargestOddNumberInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int n = num.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = num.charAt(i);

            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
