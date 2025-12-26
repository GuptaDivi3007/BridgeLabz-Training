import java.util.*;

public class LongestWordInASentence {

    public static void main(String[] args) {
        String str = "My name is Divyanshi Gupta";
        String[] arr = str.split("\\s+");
        int count = 0;
        int idx = 0;
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            if(count < arr[i].length()){
                idx = i;
                count = arr[i].length();
            }
        }

        System.out.println(arr[idx]);
    }
}