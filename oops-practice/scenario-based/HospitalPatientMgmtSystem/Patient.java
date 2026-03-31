public class Patient {

    // Encapsulation: properties are private
    private int patientId;
    private String patientName;
    private int age;

    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    // Getter methods to safely access private data
    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    // Polymorphic method (will be overridden)
    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }
}
