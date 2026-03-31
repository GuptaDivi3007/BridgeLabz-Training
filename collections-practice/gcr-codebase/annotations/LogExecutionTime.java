import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Worker {

    @LogExecutionTime
    void work() {
        for (int i = 0; i < 1000000; i++);
    }
}

public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {
        Worker w = new Worker();
        var m = Worker.class.getDeclaredMethod("work");

        long start = System.nanoTime();
        m.invoke(w);
        long end = System.nanoTime();

        System.out.println("Time: " + (end - start));
    }
}