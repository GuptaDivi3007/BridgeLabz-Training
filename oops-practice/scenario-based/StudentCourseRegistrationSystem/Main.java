public class Main {

	public static void main(String[] args) {

		try {
            Student s1 = new Student("Aditya", "adi@mail.com", "S101");
            Course c1 = new Course("C001", "Data Structures", 2);
            Course c2 = new Course("C002", "DBMS", 2);

            RegistrationService reg = new RegistrationServiceImpl();
            
            reg.enroll(s1, c1);
            reg.enroll(s1, c2);

            s1.setGrade(c1, "A");
            s1.setGrade(c2, "B+");

            s1.viewGrades();

            reg.drop(s1, c1);
        }
        
        catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }
	}
}
