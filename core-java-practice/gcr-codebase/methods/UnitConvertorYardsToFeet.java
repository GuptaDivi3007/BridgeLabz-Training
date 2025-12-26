import java.util.*;

public class UnitConvertorYardsToFeet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();

        System.out.println("Yards to Feet: " + convertYardsToFeet(value));
        System.out.println("Feet to Yards: " + convertFeetToYards(value));
        System.out.println("Meters to Inches: " + convertMetersToInches(value));
        System.out.println("Inches to Meters: " + convertInchesToMeters(value));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(value));
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}
