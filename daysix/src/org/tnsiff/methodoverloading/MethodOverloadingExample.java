// progarm to demo on method overloading
package org.tnsiff.methodoverloading;

public class MethodOverloadingExample {

	
	//method overloading by passing different types ofargument
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public float multiplication(float a, float b)
	{
		return a*b;
	}
	
	public float multiplication(int a, float b)
	{
		return a*b;
	}
	
	public float multiplication(float a, int b)
	{
		return a*b;
	}
	
	
}
