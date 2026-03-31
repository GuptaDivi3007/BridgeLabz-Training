public class VehicleQueue {

    private String[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public VehicleQueue(int capacity) {
        this.capacity = capacity;
        data = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String id) {
        if (size == capacity) {
            System.out.println("Queue Overflow: " + id);
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = id;
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return null;
        }
        String value = data[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }
}
