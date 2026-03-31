import java.util.*;

public class RotateList {

    public static void rotate(List<Integer> list, int k) {
        k = k % list.size();
        List<Integer> rotated = new ArrayList<>();

        for (int i = k; i < list.size(); i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotate(list, 2);
        System.out.println(list);
    }
}