import java.util.*;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
