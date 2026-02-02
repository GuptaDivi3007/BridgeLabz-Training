import java.lang.reflect.*;

public class GetClassInfo {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("SampleClass");

        System.out.println("Methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("Fields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        System.out.println("Constructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}

class SampleClass {
    private int x;
    public void test() {}
}