public class Vessel{
	private String vesselId;
	private String vesselName;
	private double averageSpeed;
	private String vesselType;
	
	// No argument Constructor
	public Vessel() {
		
	}
	
	// Argument constructor
	public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesselType = vesselType;
	}
	
	// getter setter
	public void setId(String vesselId) {
		this.vesselId = vesselId;
		
	}
	public String getId() {
		return vesselId;
	}
	
	public void setName(String vesselName) {
		this.vesselName = vesselName;
		
	}
	public String getName() {
		return vesselName;
	}
	
	public void setSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
		
	}
	public double getSpeed() {
		return averageSpeed;
	}
	
	public void setType(String vesselType) {
		this.vesselType = vesselType;
		
	}
	public String getType() {
		return vesselType;
	}	

}
