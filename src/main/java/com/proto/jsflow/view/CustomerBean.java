package com.proto.jsflow.view;

import java.io.Serializable;


public class CustomerBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

    private String address;

    private String city;

    private String zipCode;

    private String phoneNumber;
    
    

	public CustomerBean() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    
    
}
