

// Program to demo on package and access specifier
package org.tnsif.firstpackage;

public class Base {
	
	// declare all access modifier
	int varDefault = 10;
	public String varPublic = "John";
//	private int varPrivate =1221;
	protected float varProtected=298.33f;
	
	// declare all access specifier with method
	void methodDefault()
	{
	System.out.println("Default access mehod" + varDefault);	
	}
	public void methodPublic()
	{
	System.out.println("Default access mehod" +varPublic);	
	}
//	private void methodPrivate()
//	{
//	System.out.println("Default access mehod" + varPrivate);	
//	}
	protected void methodProtected()
	{
	System.out.println("Default access mehod" + varProtected);	
	}
}
