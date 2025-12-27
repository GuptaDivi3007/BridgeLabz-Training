import java.util.*;

public class ReplaceWordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();

        String ans = "";
        String curr = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (curr.equals(oldWord)) {
                    ans += newWord;
                }
                else {
                    ans += curr;
                }
                if (i < str.length()) {
                    ans += " ";
                }
                curr = "";
            }
            else {
                curr += str.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
