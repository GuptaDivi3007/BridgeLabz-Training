import java.util.*;

public class Course {

    static String instituteName = "Tech Academy";

    String courseName;
    int duration;
    double fee;

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 90, 12000.0);
        Course c2 = new Course("Web Development", 60, 10000.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        updateInstituteName("Global Tech Institute");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
