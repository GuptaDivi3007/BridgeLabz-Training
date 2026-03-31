public class UPIPayment implements Payment {

	@Override
    public boolean pay(double amount) {
        System.out.println("Processing UPI Payment of ₹" + amount);
        return true;
    }
}
