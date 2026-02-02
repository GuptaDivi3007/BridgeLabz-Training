import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Aryan")
    void completeTask() {}
}

public class TaskInfoAnnotation {
    public static void main(String[] args) {
        for (var m : TaskManager.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo info = m.getAnnotation(TaskInfo.class);
                System.out.println(info.priority() + " - " + info.assignedTo());
            }
        }
    }
}