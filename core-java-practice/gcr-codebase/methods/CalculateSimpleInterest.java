import java.util.*;

public class CalculateSimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double interest = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }

    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
