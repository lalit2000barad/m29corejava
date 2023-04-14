
////program to demo hierachical inheritance
//child class2
package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends Android  {

	private int versionName;
	private String modelName;
	
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Tiramisu() {
		System.out.println(" child1 default constructor");
		
	}
	public Tiramisu(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Tiramisu [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
		
		
		
}
