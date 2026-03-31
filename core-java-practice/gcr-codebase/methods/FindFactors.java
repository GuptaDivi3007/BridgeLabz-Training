import java.util.*;

public class FindFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] factors = findFactors(n);
        int sum = findSum(factors);
        long product = findProduct(factors);
        int sumOfSquares = findSumOfSquares(factors);

        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(sumOfSquares);
        System.out.println(product);
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    public static int findSumOfSquares(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }
}
