import java.util.*;

public class LongestWordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String longest = "";
        String curr = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                if (curr.length() > longest.length()) {
                    longest = curr;
                }
                curr = "";
            }
            else {
                curr += str.charAt(i);
            }
        }

        System.out.println(longest);
    }
}
