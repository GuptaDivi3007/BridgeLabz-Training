public class InPatient extends Patient implements IPayable {

    // Additional properties specific to InPatient
    private int numberOfDays;
    private double roomChargePerDay;
    private double doctorFee;

    // Constructor calling parent constructor using super
    public InPatient(int patientId, String patientName, int age,
                     int numberOfDays, double roomChargePerDay, double doctorFee) {

        super(patientId, patientName, age);
        this.numberOfDays = numberOfDays;
        this.roomChargePerDay = roomChargePerDay;
        this.doctorFee = doctorFee;
    }

    // Implementation of interface method
    @Override
    public double calculateBill() {
        return (numberOfDays * roomChargePerDay) + doctorFee;
    }

    // Overridden method (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type: InPatient");
        System.out.println("Days Admitted: " + numberOfDays);
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}
