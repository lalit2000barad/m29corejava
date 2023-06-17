//Driver class
//Program to demonstrate on MoneyMoneyBank App
package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(1, "Parag", 1500, true);
		CurrentAcc c = new MMCurrentAcc(2, "Dishant", 12000, 9000);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(300);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		
		
	}

}