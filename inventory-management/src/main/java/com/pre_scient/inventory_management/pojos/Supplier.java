package com.pre_scient.inventory_management.pojos;

public class Supplier extends Person {
	private static int idCounter=1;
	private int supplierId;
	private String companyName;
	
	public Supplier(String name, long phone, String email, int supplierId, String companyName) {
		super(name, phone, email);
		this.supplierId = idCounter++;
		this.companyName = companyName;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", companyName=" + companyName + "]";
	}
	
	
}
