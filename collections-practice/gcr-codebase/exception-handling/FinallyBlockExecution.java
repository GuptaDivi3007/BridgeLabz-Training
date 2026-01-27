import java.util.*;

public class FinallyBlockExecution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println(result);

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
