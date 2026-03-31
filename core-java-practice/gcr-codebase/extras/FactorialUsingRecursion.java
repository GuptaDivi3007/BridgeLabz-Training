import java.util.*;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = calculateFactorial(n);
        System.out.println(ans);
    }

    public static long calculateFactorial(int value) {
        if (value <= 1) {
            return 1;
        }
        return value * calculateFactorial(value - 1);
    }
}
