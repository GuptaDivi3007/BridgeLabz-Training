import java.util.*;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String s = "  the sky   is blue  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--){
            sb.append(arr[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
