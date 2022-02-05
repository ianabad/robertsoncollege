package com.address;

public class Address {
	private int streetNum;
	private String streetName, city, province, postalCode;
	
	public Address(int streetNum, String streetName, String city, String province, String postalCode) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.province = province; 
		this.postalCode = postalCode;
	}

	public String getFullAddress() {
		String fullAddress = this.streetNum + " " + this.streetName + ", " + this.city + ", " + this.province + ", " + this.postalCode;
		return fullAddress;
	}
	
	public String getProvince() {
		return province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getCity() {
		return city;
	}
	
	
}
