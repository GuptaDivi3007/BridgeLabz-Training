import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        String result = longestCommonPrefix(arr);
        System.out.print(result);
    }

    public static String longestCommonPrefix(String[] arr) {
        if(arr == null || arr.length == 0){
            return "";
        }
        String str1 = arr[0];
        int str1Len = str1.length();

        for(int i = 1; i < arr.length; i++){
            String str2 = arr[i];

            while(str1Len > str2.length() || !str1.equals(str2.substring(0, str1Len))){
                str1Len--;
                
                while(str1Len == 0){
                    return "";
                }
                str1 = str1.substring(0, str1Len);
            }
        }

        return str1;
    }
}
