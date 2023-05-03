// to demo on 
package org.tnsif.interfacedemo;
//implementable class
public class RecipeImplementable implements Recipe{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String displayName() {
		return "Welcome to 1" + name;
	}
	
}


