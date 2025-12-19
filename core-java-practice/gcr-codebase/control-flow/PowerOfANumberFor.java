import java.util.*;

public class PowerOfANumberFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();

        if (n <= 0 || power < 0) {
            System.out.println("Invalid input");
            return;
        }

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * n;
        }
        System.out.println(result);
    }
}
