public class RegistrationServiceImpl implements RegistrationService{
    
	@Override
    public void enroll(Student student, Course course) throws CourseLimitExceededException {
        if (student.getCurrentCourseCount() >= Student.MAX_COURSE_LIMIT) {
            throw new CourseLimitExceededException("Max course limit reached for student!");
        }

        if (!course.hasSeat()) {
            System.out.println("Course is full!");
            return;
        }

        student.addCourse(course);
        course.enroll();
        System.out.println(student.getStudentId() + " enrolled in " + course);
    }

    @Override
    public void drop(Student student, Course course) {
        student.dropCourse(course);
        course.drop();
        System.out.println(student.getStudentId() + " dropped " + course);
    }
}
