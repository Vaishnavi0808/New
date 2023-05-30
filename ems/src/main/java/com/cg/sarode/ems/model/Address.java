package com.cg.sarode.ems.model;

import org.springframework.data.annotation.Id;

public class Address {
	
	@Id
	private int id;
	private String appartmentName;
	private String floor;
	private String street;
	private String city;
	private int pin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppartmentName() {
		return appartmentName;
	}
	public void setAppartmentName(String appartmentName) {
		this.appartmentName = appartmentName;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address(int id, String appartmentName, String floor, String street, String city, int pin) {
		super();
		this.id = id;
		this.appartmentName = appartmentName;
		this.floor = floor;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", AppartmentName=" + appartmentName + ", Floor=" + floor + ", Street=" + street
				+ ", City=" + city + ", Pin=" + pin + "]";
	}
	
	

}
