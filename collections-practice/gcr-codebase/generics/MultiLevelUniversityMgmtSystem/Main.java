import java.util.*;

public class Main {

    public static void main(String[] args) {

        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs = new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd = new Course<>("AI Research", new ResearchCourse());

        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(math.getCourseType());
        courseTypes.add(cs.getCourseType());
        courseTypes.add(phd.getCourseType());

        CourseUtil.displayCourses(courseTypes);
    }
}
