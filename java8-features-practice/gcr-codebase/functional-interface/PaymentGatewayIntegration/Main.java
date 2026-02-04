package PaymentGatewayIntegration;

public class Main {
	public static void main(String[] args) {

        PaymentProcessor upi = new UpiPayment();
        PaymentProcessor card = new CreditCardPayment();
        PaymentProcessor wallet = new WalletPayment();

        upi.pay(500);
        upi.refund(200);

        card.pay(1000);
        card.refund(300);

        wallet.pay(700);
        wallet.refund(400);
    }
}
