import java.util.*;

public class GcdLcmCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = findGcd(num1, num2);
        int lcm = findLcm(num1, num2, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
