package SmartDeviceControlInterface;

public class Light implements SmartDevice{
	@Override
    public void turnOn() {
    	System.out.println("Light turn on");
    }
    @Override
    public void turnOff() {
    	System.out.println("Light turn off");
    }
}
