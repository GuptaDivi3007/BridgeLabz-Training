import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vesselUtil util = new vesselUtil();
		System.out.println("Enter number of vessels to be added");
		int numberofVessels = sc.nextInt();
		sc.nextLine(); // consume new line
		
		// vessel details
		System.out.println("Enter vessel details");
		for(int i =0;i< numberofVessels; i++) {
			String input = sc.nextLine();
			String[] parts = input.split(":");
            String vesselId = parts[0];
            String vesselName = parts[1];
            double averageSpeed = Double.parseDouble(parts[2]);
            String vesselType = parts[3];

            Vessel vessel = new Vessel(vesselId, vesselName, averageSpeed, vesselType);
            util.addVesselPerformance(vessel);
        }
		System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel found = util.getVesselById(searchId);
        if (found != null) {
            System.out.println(found.getId() + " | " +
                    found.getName() + " | " +
                    found.getType() + " | " +
                    found.getSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels are");
        List<Vessel> highPerf = util.getHighPerformanceVessels();
        for (Vessel v : highPerf) {
            System.out.println(v.getId() + " | " +
                    v.getName() + " | " +
                    v.getType() + " | " +
                    v.getSpeed() + " knots");
        }
			
	}
	

}
