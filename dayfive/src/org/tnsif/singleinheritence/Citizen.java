
//program to demo on single inheritance
//parent class
package org.tnsif.singleinheritence;

public class Citizen{
// private  data members
	private String name;
	private String adharNo;
	private String city;
	private long contactNo;
	
	//default 
	public Citizen() {
		super();

	
	}
	//parameterized constructor

	public Citizen(String name, String adharNo, String city, long contactNo) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.city = city;
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", city=" + city + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
	
	
}
