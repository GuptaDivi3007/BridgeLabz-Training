import java.util.*;

public class IsArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        int sum = 0;

        while (originalNum != 0) {
            int dig = originalNum % 10;
            sum = sum + (dig * dig * dig);
            originalNum = originalNum / 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        }
        else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}
