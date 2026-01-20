import java.util.*;

public class ParcelTracker {

    private StageNode head;
    private StageNode current;

    public ParcelTracker() {
        head = null;
        current = null;
    }

    public void addStage(String name) {
        StageNode node = new StageNode(name);
        if (head == null) {
            head = node;
            current = head;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addCheckpointAfter(String target, String checkpoint) {
        StageNode temp = head;
        while (temp != null) {
            if (temp.stage.equals(target)) {
                StageNode node = new StageNode(checkpoint);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }

    public void moveForward() {
        if (current == null || current.next == null) {
            return;
        }
        current = current.next;
    }

    public void markLost() {
        current = null;
    }

    public void printCurrentStage() {
        if (current == null) {
            System.out.println("Parcel status unknown");
            return;
        }
        System.out.println("Current Stage: " + current.stage);
    }

    public void printJourney() {
        StageNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
