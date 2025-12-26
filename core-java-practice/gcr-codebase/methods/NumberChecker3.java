import java.util.*;

public class NumberChecker3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Is Prime Number: " + isPrime(n));
        System.out.println("Is Neon Number: " + isNeon(n));
        System.out.println("Is Spy Number: " + isSpy(n));
        System.out.println("Is Automorphic Number: " + isAutomorphic(n));
        System.out.println("Is Buzz Number: " + isBuzz(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }
}
