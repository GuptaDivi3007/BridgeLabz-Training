import java.util.*;

public class Roundabout {

    private VehicleNode head;
    private int count;

    private VehicleQueue queue;

    public Roundabout(int capacity) {
        queue = new VehicleQueue(capacity);
        head = null;
        count = 0;
    }

    public void addToQueue(String id) {
        queue.enqueue(id);
    }

    public void allowEntry() {
        String id = queue.dequeue();
        if (id == null) {
            return;
        }

        VehicleNode node = new VehicleNode(id);

        if (head == null) {
            head = node;
            head.next = head;
        }
        else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
        count++;
    }

    public void removeFromRoundabout() {
        if (head == null) {
            System.out.println("Roundabout Empty");
            return;
        }

        if (head.next == head) {
            System.out.println(head.vehicleId + " exited");
            head = null;
            count--;
            return;
        }

        VehicleNode temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }

        System.out.println(temp.next.vehicleId + " exited");
        temp.next = head;
        count--;
    }

    public void printState() {
        if (head == null) {
            System.out.println("Roundabout Empty");
            return;
        }

        VehicleNode temp = head;
        do {
            System.out.print(temp.vehicleId + " -> ");
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("(back to start)");
    }
}
