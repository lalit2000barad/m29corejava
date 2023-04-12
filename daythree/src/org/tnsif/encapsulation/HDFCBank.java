package org.tnsif.encapsulation;

public class HDFCBank {

	
	private Long cardNo;
	private String cardType;
	private int CVVNO;
	private int pinNo;
	
	
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCVVNO() {
		return CVVNO;
	}
	public void setCVVNO(int cVVNO) {
		CVVNO = cVVNO;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFCBank [cardNo=" + cardNo + ", cardType=" + cardType + ", CVVNO=" + CVVNO + ", pinNo=" + pinNo + "]";
	}
	
	
}
