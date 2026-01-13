public class CardPayment implements Payment {
    
	@Override
    public boolean pay(double amount) {
        System.out.println("Processing Card Payment of ₹" + amount);
        return true;
    }
}
