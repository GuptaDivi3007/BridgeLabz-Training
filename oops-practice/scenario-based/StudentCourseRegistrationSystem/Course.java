public class Course {

	private String courseId;
    private String courseName;
    private int maxSeats;
    private int enrolledStudents;

    public Course(String courseId, String courseName, int maxSeats) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.enrolledStudents = 0;
    }

    public boolean hasSeat() {
        return enrolledStudents < maxSeats;
    }

    public void enroll() {
        enrolledStudents++;
    }

    public void drop() {
        enrolledStudents--;
    }

    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public String toString() {
        return courseName + " (" + courseId + ")";
    }
}
