import java.util.*;

public class RemoveDuplicatesFromAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < ans.length(); j++) {
                if (ans.charAt(j) == curr) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans += curr;
            }
        }

        System.out.println(ans);
    }
}
