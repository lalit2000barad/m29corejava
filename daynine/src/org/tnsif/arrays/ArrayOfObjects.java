//to demo on array objectsclass
package org.tnsif.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {

        //array of customer class
		Customer[] arr=new Customer[2];

		arr[0]= new Customer(23456,"bsdbs");
		arr[1]=new Customer(3286973,"hcuichd");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getId()+arr[i].getName());
		}
	}

}
