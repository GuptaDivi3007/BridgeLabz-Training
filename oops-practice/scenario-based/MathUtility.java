import java.util.*;

public class MathUtility {

    static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for factorial: ");
        int f = sc.nextInt();
        System.out.println("Factorial: " + factorial(f));

        System.out.print("Enter number to check prime: ");
        int p = sc.nextInt();
        System.out.println("Is Prime: " + isPrime(p));

        System.out.print("Enter two numbers for GCD: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("GCD: " + gcd(x, y));

        System.out.print("Enter n for Fibonacci: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + fibonacci(n));
    }
}
