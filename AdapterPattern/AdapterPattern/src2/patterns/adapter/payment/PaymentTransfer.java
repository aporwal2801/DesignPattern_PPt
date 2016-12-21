package patterns.adapter.payment;

public class PaymentTransfer {

	public PaymentTransfer() {
		// TODO Auto-generated constructor stub
	}

	public void sendPayment(PaymentGatewayIfc paymentObj){
		// call the ApI
		System.out.println("Calling the API for transfer the payment");
		System.out.println("Waiting for Response");
	}
}
