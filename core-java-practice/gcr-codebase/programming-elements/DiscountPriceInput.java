import java.util.*;

public class DiscountPriceInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPer = sc.nextDouble();

        double discount = (fee * discountPer) / 100;
        double ans = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + ans);
    }
}
