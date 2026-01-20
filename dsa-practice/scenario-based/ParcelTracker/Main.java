import java.util.*;

public class Main {

    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.printJourney();

        tracker.addCheckpointAfter("Shipped", "Custom Checkpoint");
        tracker.printJourney();

        tracker.moveForward();
        tracker.moveForward();
        tracker.printCurrentStage();

        tracker.markLost();
        tracker.printCurrentStage();
    }
}
