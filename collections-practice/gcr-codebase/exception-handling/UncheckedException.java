import java.util.*;

public class UncheckedException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println(result);

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public static int divideNumbers(int a, int b) {
        return a / b;
    }
}
