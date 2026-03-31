import java.util.*;

public class VolumeOfEarth {

    public static void main(String[] args) {
        double radKm = 6378;
        double volKm = (4.0 / 3.0) * 3.14 * Math.pow(radKm, 3);

        // (1 km = 0.621371 miles)
        double radMiles = radKm * 0.621371;
        double volMiles = (4.0 / 3.0) * 3.14 * Math.pow(radMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volKm + " and cubic miles is " + volMiles);
    }
}
