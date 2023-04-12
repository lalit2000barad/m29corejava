// program to demo on class object and constructor

package org.tnsif.classandobject;
import java.util.Scanner;
public class ConstructorDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id;
		String city,name;
		System.out.println("Enter the customer ID: ");
		id=s.nextInt();
		// to read the next line
		s.nextLine();
		System.out.println("Enter the customer Name: ");
		name=s.nextLine();
		System.out.println("Enter the customer city: ");
		city=s.nextLine();
		
		// object creation 
		customer c=new customer();
		
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		System.out.println(c);
		
		
		
		
		
		
		s.close();
		

	}

}
