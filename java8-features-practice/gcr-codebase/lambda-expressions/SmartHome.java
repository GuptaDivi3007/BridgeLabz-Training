interface LightAction {
    void activate();
}
public class SmartHome {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights turned ON due to motion.");
        LightAction nightTimeTrigger = () -> System.out.println("Dim lights activated for night.");
        LightAction voiceTrigger = () -> System.out.println("Lights turned ON via voice command.");
        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceTrigger.activate();
    }
}
