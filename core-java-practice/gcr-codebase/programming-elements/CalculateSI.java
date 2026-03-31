import java.util.*;

public class CalculateSI {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double SI = (p * r * t) / 100;
        System.out.println(SI);
    }
}
