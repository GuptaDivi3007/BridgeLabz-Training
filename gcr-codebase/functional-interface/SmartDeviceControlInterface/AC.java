package SmartDeviceControlInterface;

public class AC implements SmartDevice{
	@Override
    public void turnOn() {
    	System.out.println("AC turn on");
    }
    @Override
    public void turnOff() {
    	System.out.println("AC turn off");
    }
    
}
