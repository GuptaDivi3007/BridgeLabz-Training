import java.util.*;

public class SuppressWarningsExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(10);
        System.out.println(list);
    }
}