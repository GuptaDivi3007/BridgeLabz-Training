import java.util.*;

public class RemoveSpecificCharacterFromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char removeChar = sc.nextLine().charAt(0);

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != removeChar) {
                ans += str.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
