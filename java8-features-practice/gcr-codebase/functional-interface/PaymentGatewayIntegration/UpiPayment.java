package PaymentGatewayIntegration;

public class UpiPayment implements PaymentProcessor{
	@Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
