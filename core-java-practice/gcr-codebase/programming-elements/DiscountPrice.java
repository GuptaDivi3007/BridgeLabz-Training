import java.util.*;

public class DiscountPrice {

    public static void main(String[] args) {
        double fee = 125000;
        double discountPer = 10;

        double discount = (fee * discountPer) / 100;
        double ans = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + ans);
    }
}
