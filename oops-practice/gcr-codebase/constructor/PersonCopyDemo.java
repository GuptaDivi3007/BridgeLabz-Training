import java.util.*;

public class PersonCopyDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Rohan", 22);
        Person p2 = new Person(p1);
    }
}

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}
