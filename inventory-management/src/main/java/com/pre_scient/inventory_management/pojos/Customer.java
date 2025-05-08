package com.pre_scient.inventory_management.pojos;

public class Customer extends Person {
	private static int idCounter =1;
	private int customerId;
	private Address address;
	
	
	public Customer(String name, long phone, String email, int customerId, Address address) {
		super(name, phone, email);
		this.customerId = idCounter++;
		this.address = address;
	}


	public int getCustomerId() {
		return customerId;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", address=" + address + ", getCustomerId()=" + getCustomerId()
				+ ", getAddress()=" + getAddress() + "]";
	}
	
	
	
	
}
