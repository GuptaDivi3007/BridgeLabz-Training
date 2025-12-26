import java.util.*;

public class UnitConvertorFahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        System.out.println(convertFarhenheitToCelsius(value));
        System.out.println(convertCelsiusToFarhenheit(value));
        System.out.println(convertPoundsToKilograms(value));
        System.out.println(convertKilogramsToPounds(value));
        System.out.println(convertGallonsToLiters(value));
        System.out.println(convertLitersToGallons(value));
    }

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
