import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.print(result);
    }

    public static int reverse(int x) {
        // if(x == 0){
        //     return 0;
        // }
        boolean neg = false;
        if(x < 0){
            neg = true;
            x = -1 * x;  // convert into positive
        }

        int max_int = 2147483647;
        int min_int = -2147483648;
        int ans = 0;
        
        while(x > 0){
            int digit = x % 10;
            x = x / 10;
            if(ans > max_int / 10 || ans < min_int / 10 && digit > 7){
                return 0;
            }
            ans = ans * 10 + digit;
        }

        return (neg) ? -ans : ans;
    }
}
