import java.util.*;

public class RemoveDuplicatesUsingStringBuilder {

    public static void main(String[] args){
        String str = "abcbcaaddefa";
        StringBuilder sb = new StringBuilder();
        Set<Character> freq = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!freq.contains(ch)){
                sb.append(ch);
                freq.add(ch);
            }
        }

        System.out.println(sb.toString());
    }
}