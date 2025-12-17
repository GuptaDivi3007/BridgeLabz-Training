import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean result = isValid(s);
        System.out.print(result);
    }

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
