import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Application {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    void process() {}
}

public class RepeatableBugReport {
    public static void main(String[] args) throws Exception {
        BugReport[] bugs =
            Application.class.getDeclaredMethod("process")
            .getAnnotationsByType(BugReport.class);

        for (BugReport b : bugs) {
            System.out.println(b.description());
        }
    }
}