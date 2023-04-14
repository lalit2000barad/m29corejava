

//program to demo hierachical inheritance
//child class1
package org.tnsif.hierarchicalinheritance;

public class ScowCone extends Android {
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
	public ScowCone() {
	System.out.println(" child1 default constructor");
		
	}
	public ScowCone(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "ScowCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}
	
	
	
	

}
