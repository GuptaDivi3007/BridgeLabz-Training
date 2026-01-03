import java.util.*;

public class EducationalCourseHierarchy {

    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 60);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 45, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Spring Boot", 30, "Coursera", false, 5000.0, 10.0);

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();
    }
}

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void showDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void showDetails() {
        super.showDetails();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + finalFee);
    }
}
