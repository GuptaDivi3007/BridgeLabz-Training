import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {

    @Todo(task = "Add login", assignedTo = "Aryan")
    void login() {}

    @Todo(task = "Add payment", assignedTo = "Neha", priority = "HIGH")
    void payment() {}
}

public class TodoAnnotation {
    public static void main(String[] args) {
        for (var m : Project.class.getDeclaredMethods()) {
            Todo todo = m.getAnnotation(Todo.class);
            if (todo != null) {
                System.out.println(todo.task() + " - " + todo.assignedTo());
            }
        }
    }
}