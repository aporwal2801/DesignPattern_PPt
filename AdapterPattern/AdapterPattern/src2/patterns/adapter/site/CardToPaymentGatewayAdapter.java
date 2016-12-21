package patterns.adapter.site;

import patterns.adapter.card.CardPaymentIfc;
import patterns.adapter.payment.PaymentGatewayIfc;

public class CardToPaymentGatewayAdapter implements PaymentGatewayIfc {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;

	private final CardPaymentIfc card;

	public CardToPaymentGatewayAdapter(CardPaymentIfc card) {
		this.card = card;
		setProp();
	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	private void setProp() {
		setCardOwnerName(this.card.getCustomerName());
		setCustCardNo(this.card.getCreditCardNo());
		setCardExpMonthDate(this.card.getCardExpMonth() + "/" + this.card.getCardExpYear());
		setCVVNo(this.card.getCardCVVNo().intValue());
		setTotalAmount(this.card.getAmount());
	}
}
