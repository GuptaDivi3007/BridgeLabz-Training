import java.util.*;
public class vesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();
	
	//getter and setter
	public void setList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	public List<Vessel> getList(){
		return vesselList;
	}
	//Requirement 1 : Add vessel performance
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	//Requirement 2 : Retrieve vessel detail by vesselId
	public Vessel getVesselById(String vesselId) {
		for(Vessel v : vesselList) {
			if(v.getId().equals(vesselId)) {
				return v;
			}
		}
		return null;		
	}
	// Requirement 3 : Retrieve High performance vessel
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> result = new ArrayList<>();
		double maxSpeed = 0;
		// find maximum speed
		for(Vessel v : vesselList) {
			if(v.getSpeed() > maxSpeed) {
				maxSpeed = v.getSpeed();
			}
			
		}
		// Add all vessel with max speed
		for(Vessel v : vesselList) {
			if(v.getSpeed() == maxSpeed) {
				result.add(v);
			}
		}
		return result;
	}

}
