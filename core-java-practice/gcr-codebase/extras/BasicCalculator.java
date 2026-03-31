import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operation = sc.next();

        if (operation.equals("+")) {
            System.out.println(add(a, b));
        }
        else if (operation.equals("-")) {
            System.out.println(subtract(a, b));
        }
        else if (operation.equals("*")) {
            System.out.println(multiply(a, b));
        }
        else if (operation.equals("/")) {
            System.out.println(divide(a, b));
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
