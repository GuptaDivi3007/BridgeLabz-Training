import java.util.*;

public class ImplementQueueUsingStack {

    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println(peek());     // 10
        System.out.println(dequeue());  // 10
        System.out.println(dequeue());  // 20
        System.out.println(peek());     // 30

        enqueue(40);

        System.out.println(peek());     // 30
        System.out.println(dequeue());  // 30
        System.out.println(dequeue());  // 40
    }

    public static void enqueue(int data) {
        st1.push(data);
    }

    public static int dequeue() {
        if (st1.isEmpty()) {
            return -1;
        }

        while (st1.size() > 1) {
            st2.push(st1.pop());
        }

        int ans = st1.pop();

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        return ans;
    }

    public static int peek() {
        if (st1.isEmpty()) {
            return -1;
        }

        while (st1.size() > 1) {
            st2.push(st1.pop());
        }

        int ans = st1.peek();

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

        return ans;
    }

    public static boolean isEmpty() {
        return st1.isEmpty();
    }
}
