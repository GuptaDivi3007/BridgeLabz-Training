import java.util.*;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int distancePerStop = 2;

        while (true) {
            String getOff = sc.next();

            if (getOff.equalsIgnoreCase("yes")) {
                break;
            }

            totalDistance += distancePerStop;
        }

        System.out.println(totalDistance);
    }
}
