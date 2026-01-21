import java.util.*;

public class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType type : courses) {
            System.out.println(type.getEvaluationMode());
        }
    }
}
