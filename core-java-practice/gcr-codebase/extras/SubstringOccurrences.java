import java.util.*;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subStr = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            boolean match = true;

            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        System.out.println(count);
    }
}
