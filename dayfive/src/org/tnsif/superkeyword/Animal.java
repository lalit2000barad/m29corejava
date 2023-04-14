
//program to  demo super keyword
package org.tnsif.superkeyword;

public class Animal {

	
	
	public String animalType="wild";
	public int nooflegs=2;
	
	public Animal() {
		System.out.println(" parent class constructor ");
	}
	public void display()
	{
		System.out.println("Animal Type:" + animalType);
		System.out.println("No of Legs" + nooflegs);
	}



	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", nooflegs=" + nooflegs + "]";
	}
	
	
	
	
	
}
