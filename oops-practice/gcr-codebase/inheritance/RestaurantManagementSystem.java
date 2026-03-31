import java.util.*;

public class RestaurantManagementSystem {

    public static void main(String[] args) {
        Worker chef = new Chef("Arjun", 101);
        Worker waiter = new Waiter("Ravi", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking food");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving customers");
    }
}
