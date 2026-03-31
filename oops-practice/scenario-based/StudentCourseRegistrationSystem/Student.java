import java.util.*;

public class Student extends Person {
    
	private String studentId;
    private List<Course> enrolledCourses;
    private Map<Course, String> grades;

    public static final int MAX_COURSE_LIMIT = 5;

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
        grades.remove(course);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setGrade(Course course, String grade) {
        grades.put(course, grade);
    }

    public void viewGrades() {
        System.out.println("Grades for " + name + ":");
        for (Map.Entry<Course, String> entry : grades.entrySet()) {
            System.out.println(entry.getKey().getCourseName() + " → " + entry.getValue());
        }
    }

    public int getCurrentCourseCount() {
        return enrolledCourses.size();
    }

    public String getStudentId() {
        return studentId;
    }
}
