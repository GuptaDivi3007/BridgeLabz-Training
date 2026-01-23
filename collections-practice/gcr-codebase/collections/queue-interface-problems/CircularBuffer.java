public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int start = 0;
    private int count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void add(int value) {
        buffer[(start + count) % size] = value;

        if (count < size) {
            count++;
        } else {
            start = (start + 1) % size;
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(start + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);

        cb.display();
    }
}