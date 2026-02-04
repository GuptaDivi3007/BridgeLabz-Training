package DigitalPaymentInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
	}

}
