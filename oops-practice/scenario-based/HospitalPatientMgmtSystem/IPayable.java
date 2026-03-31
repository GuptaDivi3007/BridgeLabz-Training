public interface IPayable {

    // Any class that implements IPayable MUST calculate a bill
    double calculateBill();
}
