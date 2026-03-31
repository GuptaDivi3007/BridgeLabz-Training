public class Bill implements IPayable {

    private int billId;

    // Patient for whom the bill is generated
    // Parent reference to support polymorphism
    private Patient patient;

    private double totalAmount;

    // Constructor to create a bill for a patient
    public Bill(int billId, Patient patient) {
        this.billId = billId;
        this.patient = patient;

        // Bill amount decided at runtime
        // based on actual patient type (InPatient / OutPatient)
        this.totalAmount = calculateBill();
    }


    @Override
    public double calculateBill() {

        // instanceOf check kr rha h ki konsi class ka patient h usi ka bill func call krega
        if (patient instanceof InPatient) {
            return ((InPatient) patient).calculateBill();
        }
        else if (patient instanceof OutPatient) {
            return ((OutPatient) patient).calculateBill();
        }

        return 0;
    }


    public void displayBill() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Total Amount to Pay: ₹" + totalAmount);
    }
}
