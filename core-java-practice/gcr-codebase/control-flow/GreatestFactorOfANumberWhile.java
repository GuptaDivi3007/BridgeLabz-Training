import java.util.*;

public class GreatestFactorOfANumberWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("No greatest factor exists");
            return;
        }

        int greatestFactor = 1;
        int count = n - 1;

        while (count >= 1) {
            if (n % count == 0) {
                greatestFactor = count;
                break;
            }
            count--;
        }
        System.out.println(greatestFactor);
    }
}
