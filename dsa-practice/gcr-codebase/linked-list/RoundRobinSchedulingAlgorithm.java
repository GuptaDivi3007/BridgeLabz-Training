import java.util.*;

class Process {
    int pid;
    int burstTime;
    int priority;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = this; 
    }
}

public class RoundRobinSchedulingAlgorithm {

    static Process head = null;

	public static void main(String[] args) {
		
        int quantum = 3; 

        addProcess(1, 10, 1);
        addProcess(2, 5, 2);
        addProcess(3, 8, 1);
       
        int[] originalBurst = {10, 5, 8};
        int[] completionTime = new int[3];
        int totalTime = 0;

        System.out.println("Initial Process Queue:");
        displayQueue();
       
        Process current = head;

        while (head != null) {
            int executed = Math.min(current.burstTime, quantum);
            current.burstTime -= executed;
            totalTime += executed;

            System.out.println("Executing PID " + current.pid + " for " + executed + " units");

            if (current.burstTime == 0) {
                completionTime[current.pid - 1] = totalTime;
                System.out.println("Process PID " + current.pid + " completed!");
                int pidToRemove = current.pid;
                current = current.next;
                removeProcess(pidToRemove);
            }
            else {
                current = current.next;
            }

            System.out.println("Queue after this round:");
            displayQueue();
        }
       
        int[] turnaround = new int[3];
        int[] waiting = new int[3];
        for (int i = 0; i < 3; i++) {
            turnaround[i] = completionTime[i];
            waiting[i] = turnaround[i] - originalBurst[i];
        }
        
        double avgWT = 0;
        double avgTAT = 0;
        System.out.println("Final Results:");

        for (int i = 0; i < 3; i++) {
            System.out.println("PID " + (i + 1) + 
                " || Waiting Time = " + waiting[i] + 
                ", Turnaround Time = " + turnaround[i]);
            avgWT += waiting[i];
            avgTAT += turnaround[i];
        }
        
        System.out.println("Average Waiting Time = " + (avgWT / 3));
        System.out.println("Average Turnaround Time = " + (avgTAT / 3));
	}

	public static void addProcess(int pid, int burstTime, int priority) {
        Process newNode = new Process(pid, burstTime, priority);

        if (head == null) {
            head = newNode;
            return;
        }

        Process temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    
    public static void removeProcess(int pid) {
        if (head == null) {
            return;
        }

        Process curr = head;
        Process prev = null;

        do {
            if (curr.pid == pid) {
                if (prev == null) {
                    if (head.next == head) {
                        head = null;
                    }
                    else {
                       
                        Process last = head;
                        while (last.next != head) last = last.next;
                        last.next = head.next;
                        head = head.next;
                    }
                }
                else {
                    prev.next = curr.next;
                }

                return;
            }
            prev = curr;
            curr = curr.next;
        }
        while (curr != head);
    }
    
    public static void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Process temp = head;
        do {
            System.out.print("[PID: " + temp.pid + ", BT: " + temp.burstTime + "] -> ");
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("(back to head)");
    }
}
