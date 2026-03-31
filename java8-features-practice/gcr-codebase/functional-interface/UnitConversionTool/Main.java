package UnitConversionTool;

public class Main {

	public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 50;

        double distanceMiles = UnitConverter.kmToMiles(distanceKm);
        double weightLbs = UnitConverter.kgToLbs(weightKg);

        System.out.println(distanceKm + " km = " + distanceMiles + " miles");
        System.out.println(weightKg + " kg = " + weightLbs + " lbs");

       
        System.out.println("100 miles = " + UnitConverter.milesToKm(100) + " km");
        System.out.println("220 lbs = " + UnitConverter.lbsToKg(220) + " kg");
    }
}
