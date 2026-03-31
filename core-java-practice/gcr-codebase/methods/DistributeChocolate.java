import java.util.*;

public class DistributeChocolate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfChoclate = sc.nextInt();
        int noOfChildren = sc.nextInt();

        int[] ans = findRemainderAndQuotient(noOfChoclate, noOfChildren);

        System.out.println("Each child gets " + ans[0] + " chocolates");
        System.out.println("Remaining chocolates " + ans[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatePerChild = number / divisor;
        int remaining = number % divisor;
        return new int[]{chocolatePerChild, remaining};
    }
}
