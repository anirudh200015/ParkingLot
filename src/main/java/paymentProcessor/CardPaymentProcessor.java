package paymentProcessor;

public class CardPaymentProcessor implements paymentProcessor{

	
	
	@Override
	public void processPayment(double amt) {
		 System.out.println("Processed card payment of ₹" + amt);
		
	}

}
