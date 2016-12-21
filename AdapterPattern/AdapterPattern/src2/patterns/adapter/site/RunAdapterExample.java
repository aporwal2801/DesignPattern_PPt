package patterns.adapter.site;

import patterns.adapter.card.CardPaymentIfc;
import patterns.adapter.card.CardPaymentImp;
import patterns.adapter.payment.PaymentGatewayIfc;
import patterns.adapter.payment.PaymentTransfer;

public class RunAdapterExample {

	public static void main(String[] args) {

		// Object for Card
		CardPaymentIfc card = new CardPaymentImp();
		card.setCreditCardNo("4789565874102365");
		card.setCustomerName("Max Warner");
		card.setCardExpMonth("09");
		card.setCardExpYear("25");
		card.setCardCVVNo((short) 235);
		card.setAmount(2565.23);

		PaymentGatewayIfc payD = new CardToPaymentGatewayAdapter(card);
		testPayD(payD);
		PaymentTransfer payment = new PaymentTransfer();
		payment.sendPayment(payD);
	}

	private static void testPayD(PaymentGatewayIfc payD) {

		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
	}

}
