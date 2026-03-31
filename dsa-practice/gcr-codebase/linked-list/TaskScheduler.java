import java.util.*;

class Task {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {

	static Task head = null;
    static Task current = null;

	public static void main(String[] args) {
		
        addAtBeginning(1, "Design Module", "High", "2026-01-10");
        addAtEnd(2, "Implement Logic", "Medium", "2026-01-12");
        addAtPosition(2, 3, "Code Review", "Low", "2026-01-15");

        System.out.println("All Tasks:");
        displayAll();

        System.out.println("\nRemove Task ID 2");
        removeById(2);
        displayAll();

        System.out.println("\nSearching Priority = High");
        searchByPriority("High");

        System.out.println("\nCircular Navigation:");
        viewCurrentAndNext();
        viewCurrentAndNext();
        viewCurrentAndNext();
	}

	public static void addAtBeginning(int id, String name, String priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
        }
        else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            head = newTask;
            temp.next = head;
        }
    }

	public static void addAtEnd(int id, String name, String priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newTask;
        newTask.next = head;
    }

	public static void addAtPosition(int pos, int id, String name, String priority, String dueDate) {
        if (pos <= 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        int count = 1;

        while (temp.next != head && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }

	public static void removeById(int id) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task temp = head;
        Task prev = null;
        
        if (temp.taskId == id) {
            if (temp.next == head) { 
                head = null;
                current = null;
                return;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }
       
        temp = head;
        do {
            prev = temp;
            temp = temp.next;
            if (temp.taskId == id) {
                prev.next = temp.next;
                return;
            }
        }
        while (temp != head);

        System.out.println("Task not found!");
    }
   
    public static void viewCurrentAndNext() {
        if (current == null) {
            System.out.println("Task list is empty!");
            return;
        }
        System.out.println("Current Task → ID: " + current.taskId + ", Name: " + current.taskName +
                ", Priority: " + current.priority + ", Due: " + current.dueDate);
        current = current.next; 
    }

    public static void displayAll() {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task temp = head;
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        }
        while (temp != head);
    }
    
    public static void searchByPriority(String priority) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println("Found → ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        }
        while (temp != head);

        if (!found) {
            System.out.println("No task found with priority: " + priority);
        }
    }
}
