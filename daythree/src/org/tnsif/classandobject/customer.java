
//Program  to demonstrate on class ,object and constructors
package org.tnsif.classandobject;

public class customer {

	//private data members
	
	private int customerId;
	private String customerName;
	private String city;
	
	
    //	initilize class variable
	//constructors does not have any return type
	//it is same as classname followed by "()"
	
	
	//default 
	public customer() {
		super();
	}

	//parameterize
	
	public customer(int customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}


	/* to access all theprivate  data members into the
	 * another class
	 * then use getters and setters */
	
	

	//setters and getters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

//object of class is tostring method

	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
	}
	
	
	
	
	
}
