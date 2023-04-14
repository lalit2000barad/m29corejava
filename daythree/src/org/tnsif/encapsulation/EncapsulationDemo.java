package org.tnsif.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {

		//object creation 
		HDFCBank h = new HDFCBank();
		
		h.setCardNo(234567891234L);
		h.setCardType("Debit card");
		h.setCVVNO(444);
		h.setPinNo(1001);
		
		//getters is used 
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCVVNO());
		System.out.println(h.getPinNo());
		
	}
}
