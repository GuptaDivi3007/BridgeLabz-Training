import java.util.HashSet;
import java.util.TreeSet;

public class SearchDataStructureComparison {

    // Linear search on array
    public static boolean arraySearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int size = 1_000_000;
        int target = size - 1;

        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, time;

        // Array search
        start = System.currentTimeMillis();
        arraySearch(array, target);
        time = System.currentTimeMillis() - start;
        System.out.println("Array Search Time: " + time + " ms");

        // HashSet search
        start = System.currentTimeMillis();
        hashSet.contains(target);
        time = System.currentTimeMillis() - start;
        System.out.println("HashSet Search Time: " + time + " ms");

        // TreeSet search
        start = System.currentTimeMillis();
        treeSet.contains(target);
        time = System.currentTimeMillis() - start;
        System.out.println("TreeSet Search Time: " + time + " ms");
    }
}
