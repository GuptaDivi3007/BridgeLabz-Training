import java.util.*;

public class AllMultiplesOfANumberFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0 || n >= 100) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 100; i >= 1; i--) {
            if (i < 100 && i % n == 0) {
                System.out.println(i);
                continue;
            }
        }
    }
}
