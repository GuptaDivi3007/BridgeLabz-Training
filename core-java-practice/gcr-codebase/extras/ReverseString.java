import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(arr));
    }
}
