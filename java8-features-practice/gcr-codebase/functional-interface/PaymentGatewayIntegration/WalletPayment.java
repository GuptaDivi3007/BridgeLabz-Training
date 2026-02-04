package PaymentGatewayIntegration;

public class WalletPayment implements PaymentProcessor{
	@Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed to Wallet");
    }
}
