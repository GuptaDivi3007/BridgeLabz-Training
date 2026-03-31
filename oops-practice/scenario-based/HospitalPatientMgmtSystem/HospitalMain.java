public class HospitalMain {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 35, 5, 2000, 3000);
        p1.displayInfo();

        System.out.println("-------------------------");


        Patient p2 = new OutPatient(102, "Anita", 28, 800);
        p2.displayInfo();

        System.out.println("-------------------------");


        Doctor doctor = new Doctor(1, "Dr. Sharma", "Cardiology");
        doctor.displayDoctorInfo();
    }
}
