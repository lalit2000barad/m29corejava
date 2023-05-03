
//program to demo on functional interface 
//- an interface which contain exactly one abstract method
package org.tnsif.interfacedemo;

/*  below annotion tell us that interface must have one abstract method*/

@FunctionalInterface
public interface Recipe {
	/* by default all the methods inside an interface are publicabstract variable
	 * are public static final*/

	//abstract method
	String displayName();
	//String print();

}
