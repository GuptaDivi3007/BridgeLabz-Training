import java.util.*;

public class CalculateTrigonometricFunctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();

        double[] ans = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + ans[0]);
        System.out.println("Cosine: " + ans[1]);
        System.out.println("Tangent: " + ans[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }
}
