import java.util.*;

public class ConcatenateStrings {

    public static void main(String[] args){
        String[] str = {"hello", "everyone", "welcome", "to", "my", "channel"};
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < str.length; i++){
            sb.append(str[i]);
        }

        System.out.println(sb.toString());
    }
}