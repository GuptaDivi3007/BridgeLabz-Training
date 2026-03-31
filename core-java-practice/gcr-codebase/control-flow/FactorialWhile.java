import java.util.*;

public class FactorialWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
