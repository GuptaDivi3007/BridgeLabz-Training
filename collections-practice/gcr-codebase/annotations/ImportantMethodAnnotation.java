import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {

    @ImportantMethod
    void save() {}

    @ImportantMethod(level = "LOW")
    void log() {}
}

public class ImportantMethodAnnotation {
    public static void main(String[] args) {
        for (var m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                System.out.println(m.getName());
            }
        }
    }
}