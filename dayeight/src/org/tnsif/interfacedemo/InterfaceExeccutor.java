package org.tnsif.interfacedemo;

public class InterfaceExeccutor {



		public static void main(String[] args) {
			ATMMachine a1 = new ATMMachineChild();
			a1.deposit();
			a1.withdraw();
			
			RecipeImplementable r = new RecipeImplementable();
			r.setName("C2TC Program");
			System.out.println(r.displayName());

			NestedInterfaceExample n = new NestedInterfaceExample(); 
				n.setStr1("Nia");
				n.setStr2("jscn");
			  
				
			
		}
		
	}
