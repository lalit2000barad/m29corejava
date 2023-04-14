package org.tnsif.secondpackage;
//import org.tnsif.firstpackage.*;
//way to import the package 
import org.tnsif.firstpackage.Base;
public class Executor {
	public static void main (String[]args) {
		Base b1 =new Base();
		//if any method is default we cannot access into 
		//another package ; we can only access in same pakage
		//b1.methodDefault();
		
		b1.methodPublic();
		
	}

}
