// to demo on abstract class and abstract method
package org.tnsif.abstractkeyworddemo;
/* if any class contains atleast one abstract method then that class must be 
 * declare as an abstract class*/
public abstract class Remote {

	
	public String cellName;
	/* abstract class can have contain abstract and 
	 * non abstract method*/
	
	abstract void functionRemote();
	
	void display()
	{
		System.out.println("cell name is "+ cellName);
	}
}
class RemoteChild extends Remote
{
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
}