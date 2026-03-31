import java.util.*;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisor = sc.nextInt();

        int[] ans = findRemainderAndQuotient(n, divisor);
        System.out.println("Quotient: " + ans[0]);
        System.out.println("Remainder: " + ans[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }
}
