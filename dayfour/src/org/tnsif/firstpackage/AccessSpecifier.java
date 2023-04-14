
// driver class
// program to demo on pakage access
package org.tnsif.firstpackage;
public class AccessSpecifier {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		//Private members ,we cant access into another class
		//b.varPrivate;
		//b.methodPrivate();
		System.out.println(b instanceof Base);

	}

}
