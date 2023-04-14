
//programto  demo on super keywords
package org.tnsif.superkeyword;
//child class
public class Tiger extends Animal {

	
	public String animalType="Tiger-wild";
	public int nooflegs=4;
	
	
	//default constructor
	public Tiger() {
		//invoking the parent class constructor
		//
		super();
		System.out.println(" Tiger class constructor ");
	}
	
	
	public void display()
	{
		super.display();
//		System.out.println(super.animalType);
//		System.out.println(super.nooflegs);
		System.out.println("Animal Type:" + animalType);
		System.out.println("No of Legs" + nooflegs);
	}


	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", nooflegs=" + nooflegs + "]";
	}

	
	
	

}
