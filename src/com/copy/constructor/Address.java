package com.copy.constructor;

public class Address{

	String city;
	String country;
	int pin;
	
	public Address() {
		super();
	}

	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	
}
