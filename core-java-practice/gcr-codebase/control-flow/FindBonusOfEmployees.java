import java.util.*;

public class FindBonusOfEmployees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearOfService = sc.nextInt();

        if (yearOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        }
        else {
            System.out.println("The bonus amount is 0.0");
        }
    }
}
