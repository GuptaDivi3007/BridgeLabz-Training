import java.util.*;

public class NaturalNumberSumComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println(recursiveSum);
        System.out.println(formulaSum);
    }

    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
