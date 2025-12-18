import java.util.*;

public class DistanceConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distInFeet = sc.nextDouble();

        double distInYards = distInFeet / 3;
        double distInMiles = distInYards / 1760;

        System.out.println("The distance in yards is " + distInYards + " while the distance in miles is " + distInMiles);
    }
}
