public class OutPatient extends Patient implements IPayable {

    // Property specific to OutPatient
    private double consultationFee;

    public OutPatient(int patientId, String patientName, int age, double consultationFee) {
        super(patientId, patientName, age);
        this.consultationFee = consultationFee;
    }

    // Interface method implementation
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Polymorphism: different behavior for same method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type: OutPatient");
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}
