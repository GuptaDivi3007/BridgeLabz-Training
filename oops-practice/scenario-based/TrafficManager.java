import java.util.*;

public class TrafficManager {

	private ArrayList<String> roundabout;           
    private ArrayList<String> waiting;             
    private int maxWaiting;                         
    private int pointer = 0;                       

    public TrafficManager(int maxWaiting) {
        roundabout = new ArrayList<>();
        waiting = new ArrayList<>();
        this.maxWaiting = maxWaiting;
    }
   
    public void arrive(String car) {
        if (waiting.size() >= maxWaiting) {
            System.out.println("Queue Overflow! Car " + car + " cannot wait.");
            return;
        }
        waiting.add(car);
        System.out.println("Car " + car + " arrived and waiting.");
    }

    public void allowEntry() {
        if (waiting.isEmpty()) {
            System.out.println("Queue Underflow! No car waiting to enter.");
            return;
        }
        String car = waiting.remove(0);  
        roundabout.add(car);
        System.out.println("Car " + car + " entered the roundabout.");
    }

    public void exitRoundabout() {
        if (roundabout.isEmpty()) {
            System.out.println("Roundabout is empty!");
            return;
        }
        
        if (pointer >= roundabout.size()) {
            pointer = 0;
        }
        String car = roundabout.remove(pointer);
        System.out.println("Car " + car + " exited the roundabout.");
    }

    public void rotate() {
        if (roundabout.isEmpty()) {
            System.out.println("No cars to rotate.");
            return;
        }
        pointer = (pointer + 1) % roundabout.size();
        System.out.println("Rotated. Current front car: " + roundabout.get(pointer));
    }

    public void printState() {
        System.out.println("\n--- ROUNDABOUT STATE ---");
        System.out.println("Inside Roundabout: " + roundabout);
        System.out.println("Waiting: " + waiting);
        System.out.println("Pointer at index: " + pointer);
        System.out.println("------------------------\n");
    }

    public static void main(String[] args) {
        TrafficManager tm = new TrafficManager(3);

        tm.arrive("CarA");
        tm.arrive("CarB");
        tm.arrive("CarC");
        tm.arrive("CarD"); 

        tm.printState();

        tm.allowEntry();
        tm.allowEntry();
        tm.printState();

        tm.rotate();
        tm.exitRoundabout();
        tm.printState();

        tm.allowEntry();
        tm.printState();

        tm.exitRoundabout();
        tm.exitRoundabout();
        tm.exitRoundabout(); 
    }
}
