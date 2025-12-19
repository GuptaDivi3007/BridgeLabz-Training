import java.util.*;

public class PowerOfANumberWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Invalid input: power must be non-negative");
            return;
        }

        int result = 1;
        int count = 0;

        while (count < power) {
            result = result * n;
            count++;
        }
        System.out.println(result);
    }
}
