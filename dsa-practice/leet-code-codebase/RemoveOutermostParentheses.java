import java.util.*;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (open > 0) {
                    sb.append(ch);
                }
                open++;
            }
            else {
                open--;
                if (open > 0) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
