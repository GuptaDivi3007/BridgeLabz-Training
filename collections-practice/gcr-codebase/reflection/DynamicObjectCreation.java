class Student {
    String name = "Aryan";
}

public class DynamicObjectCreation {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Object Created: " + obj.getClass().getSimpleName());
    }
}