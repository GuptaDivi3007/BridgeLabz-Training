import java.util.*;

public class CountingSort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        countingSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void countingSort(int[] arr, int n) {

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[n];

        // Step 1: Count frequency
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 2: Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements (stable)
        for (int i = n-1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}