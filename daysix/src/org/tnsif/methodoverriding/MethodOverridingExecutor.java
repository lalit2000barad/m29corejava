package org.tnsif.methodoverriding;

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		hdfc h = new hdfc();
		System.out.println(((Object) h).getInterestRate());

	}

}
