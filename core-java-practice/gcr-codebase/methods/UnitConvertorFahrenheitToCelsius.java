import java.util.*;

public class UnitConvertorFahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();

        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(value));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(value));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(value));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(value));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(value));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(value));
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
