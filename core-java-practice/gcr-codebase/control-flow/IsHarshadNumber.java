import java.util.*;

public class IsHarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        if (originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad Number");
        }
        else {
            System.out.println(originalNum + " is not a Harshad Number");
        }
    }
}
