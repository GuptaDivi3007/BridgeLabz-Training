import java.util.*;

public class ToggleCaseOfCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ans = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans[i] = (char) (ch - 32);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ans[i] = (char) (ch + 32);
            }
            else {
                ans[i] = ch;
            }
        }

        System.out.println(new String(ans));
    }
}
