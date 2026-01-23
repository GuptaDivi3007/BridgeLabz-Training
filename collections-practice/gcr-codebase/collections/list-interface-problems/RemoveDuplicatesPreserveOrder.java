import java.util.*;

public class RemoveDuplicatesPreserveOrder {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        Set<Integer> unique = new LinkedHashSet<>(list);

        List<Integer> result = new ArrayList<>(unique);
        System.out.println(result);
    }
}