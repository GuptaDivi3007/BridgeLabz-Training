import java.util.*;

public class MetroSmartCardFareDeduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();

        while (balance > 0) {
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            double fare = distance <= 5 ? 10 : distance <= 15 ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println(balance);
            }
            else {
                System.out.println("Insufficient Balance");
                break;
            }
        }
    }
}
