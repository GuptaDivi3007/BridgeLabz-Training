import java.util.*;

public class TriangularParkProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double ans = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + ans + " rounds");
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
}
