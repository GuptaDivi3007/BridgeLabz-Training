import java.util.*;

public class Main {

    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout(4);

        roundabout.addToQueue("Car-1");
        roundabout.addToQueue("Car-2");
        roundabout.addToQueue("Car-3");

        roundabout.allowEntry();
        roundabout.allowEntry();
        roundabout.printState();

        roundabout.addToQueue("Car-4");
        roundabout.addToQueue("Car-5");

        roundabout.allowEntry();
        roundabout.printState();

        roundabout.removeFromRoundabout();
        roundabout.printState();

        roundabout.removeFromRoundabout();
        roundabout.removeFromRoundabout();
        roundabout.removeFromRoundabout();
    }
}
