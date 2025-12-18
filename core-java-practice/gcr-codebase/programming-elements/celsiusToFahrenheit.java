import java.util.*;

public class celsiusToFahrenheit {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;

        System.out.print(f);
    }
}
