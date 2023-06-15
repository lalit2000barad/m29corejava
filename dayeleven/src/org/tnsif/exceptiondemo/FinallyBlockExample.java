
// program to demo when finally block is not executed, just use system.exit(0)
package org.tnsif.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated 
		
		
		int arr[]= new int[] {101,33,78};
		System.out.println("Array is:");
		
		try {
			 // System.exit(0);
		       System.out.println(arr[3]);
		     
	    }
		catch(Exception e){
			   System.out.println("Exception handled" + e);
		}
		finally
		{
			System.out.println(13/0);
			System.out.println("Finally block");
		}

	}
}
