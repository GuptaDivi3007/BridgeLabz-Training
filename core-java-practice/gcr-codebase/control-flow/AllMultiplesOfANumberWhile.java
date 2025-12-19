import java.util.*;

public class AllMultiplesOfANumberWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0 || n >= 100) {
            System.out.println("Invalid input");
            return;
        }

        int counter = 99;
        while (counter >= 1) {
            if (counter % n == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
