import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error");
            return;
        }

        String[] ans = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                ans[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                ans[i - 1] = "Buzz";
            }
            else {
                ans[i - 1] = String.valueOf(i);
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + ans[i]);
        }
    }
}
