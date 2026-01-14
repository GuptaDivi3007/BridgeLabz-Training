import java.util.ArrayList;

class StockSpan {

    static ArrayList<Integer> calculateSpan(int[] arr) {

        int n = arr.length; 
        ArrayList<Integer> span = new ArrayList<>(
                              Collections.nCopies(n, 0));  
        Stack<Integer> st = new Stack<>();  

        // Process each day's price
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, all elements to the left are smaller
            // Else, top of the stack is the last greater element's index

            if (st.isEmpty()) {
                span.set(i, (i + 1));
            } else {
                span.set(i, (i - st.peek()));
            }

            // Push the current index to the stack
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] arr = {10, 4, 5, 90, 120, 80};
      
        ArrayList<Integer> span = calculateSpan(arr);

        for (int i = 0 ; i < span.size(); i++) {
            System.out.print(span.get(i) + " ");
        }
    }
}