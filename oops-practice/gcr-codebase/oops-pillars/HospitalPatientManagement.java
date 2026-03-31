import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    protected List<String> medicalHistory = new ArrayList<>();

    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    String getPatientId() {
        return patientId;
    }

    String getName() {
        return name;
    }

    void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    InPatient(String id, String name, int age, int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public void viewRecords() {
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public void viewRecords() {
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

public class HospitalPatientManagement {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("P101", "Lathika", 30, 5, 2000);
        OutPatient p2 = new OutPatient("P202", "Rohan", 24, 500);

        p1.addRecord("Admitted for surgery");
        p1.addRecord("Post-op recovery");

        p2.addRecord("General checkup");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("--------------------");
        }
    }
}
