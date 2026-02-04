package TemperatureAlertSystem;
import java.util.function.Predicate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double threshold = 40.0;

        
        Predicate<Double> isTemperatureHigh = temperature -> temperature > threshold;

        
        checkTemperature(35.0, isTemperatureHigh);
        checkTemperature(42.5, isTemperatureHigh);
        checkTemperature(40.0, isTemperatureHigh);
	}
	static void checkTemperature(double temperature, Predicate<Double> predicate) {

        if (predicate.test(temperature)) {
            System.out.println("ALERT! High temperature detected: " + temperature + "°C");
        } else {
            System.out.println("Temperature normal: " + temperature + "°C");
        }
    }
}
