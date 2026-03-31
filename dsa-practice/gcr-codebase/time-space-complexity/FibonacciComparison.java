public class FibonacciComparison {

    // Recursive approach (inefficient for large N)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative approach (efficient)
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 30;

        long start = System.currentTimeMillis();
        int recResult = fibonacciRecursive(n);
        long recTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        int itrResult = fibonacciIterative(n);
        long itrTime = System.currentTimeMillis() - start;

        System.out.println("Fibonacci number: " + n);
        System.out.println("Recursive Result: " + recResult);
        System.out.println("Recursive Time: " + recTime + " ms");

        System.out.println("Iterative Result: " + itrResult);
        System.out.println("Iterative Time: " + itrTime + " ms");
    }
}
