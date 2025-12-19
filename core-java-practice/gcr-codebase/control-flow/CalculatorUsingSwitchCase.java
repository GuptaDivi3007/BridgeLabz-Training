import java.util.*;

public class CalculatorUsingSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operand = sc.next();

        switch (operand) {
            case "+":
                System.out.println("Result = " + (a + b));
                break;

            case "-":
                System.out.println("Result = " + (a - b));
                break;

            case "*":
                System.out.println("Result = " + (a * b));
                break;

            case "/":
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                }
                else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
