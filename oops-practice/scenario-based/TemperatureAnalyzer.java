import java.util.*;

public class TemperatureAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[][] temperatures = new float[7][24];

        for (int day = 0; day < 7; day++) {
            System.out.println("Enter temperatures for Day " + (day + 1));
            for (int hour = 0; hour < 24; hour++) {
                temperatures[day][hour] = sc.nextFloat();
            }
        }

        analyzeTemperatures(temperatures);
    }

    public static void analyzeTemperatures(float[][] temp) {

        float hottestAvg = Float.MIN_VALUE;
        float coldestAvg = Float.MAX_VALUE;

        int hottestDay = 0;
        int coldestDay = 0;

        System.out.println("\nAverage Temperature per Day:");

        for (int day = 0; day < 7; day++) {
            float sum = 0;

            for (int hour = 0; hour < 24; hour++) {
                sum += temp[day][hour];
            }

            float average = sum / 24;
            System.out.println("Day " + (day + 1) + ": " + average);

            if (average > hottestAvg) {
                hottestAvg = average;
                hottestDay = day + 1;
            }

            if (average < coldestAvg) {
                coldestAvg = average;
                coldestDay = day + 1;
            }
        }

        System.out.println("\nHottest Day: Day " + hottestDay + " (Avg Temp: " + hottestAvg + ")");
        System.out.println("Coldest Day: Day " + coldestDay + " (Avg Temp: " + coldestAvg + ")");
    }
}
