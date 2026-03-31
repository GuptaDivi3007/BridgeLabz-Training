import java.util.*;

public class CompareTwoCharArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();

        char[] manualArr = manualGetChar(text);
        char[] builtInArr = text.toCharArray();

        boolean isSame = compareCharArrays(manualArr, builtInArr);

        System.out.print("Charac by user-defined method: ");
        for (char ch : manualArr) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both character arrays same? " + isSame);
    }

    static char[] manualGetChar(String text) {
        char[] ans = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            ans[i] = text.charAt(i);
        }
        return ans;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
