import java.util.*;

public class CompareTwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean charAtAns = compareUsingCharAt(str1, str2);
        boolean equalsAns = str1.equals(str2);

        System.out.println("Result using charAt(): " + charAtAns);
        System.out.println("Result using equals(): " + equalsAns);

        if (charAtAns == equalsAns) {
            System.out.println(" SAME result.");
        }
        else {
            System.out.println("DIFFERENT results.");
        }
    }

    static boolean compareUsingCharAt(String s1, String s2) {
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
