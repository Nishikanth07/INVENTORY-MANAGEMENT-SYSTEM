package com.pre_scient.inventory_management.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrder implements Order {
	
	private Supplier supplier;
	private Date date;
	private List<OrderItem> itemsList;
	
	
	

	public PurchaseOrder(Supplier supplier, Date date, List<OrderItem> itemsList) {
		super();
		this.supplier = supplier;
		this.date = date;
		this.itemsList = new ArrayList<>();
	}
	
	

	public Supplier getSupplier() {
		return supplier;
	}



	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



//	public List<OrderItem> getItemsList() {
//		return itemsList;
//	}
//
//
//
//	public void setItemsList(List<OrderItem> itemsList) {
//		this.itemsList = itemsList;
//	}



	@Override
	public void addItem(OrderItem o) {
		itemsList.add(o);

	}

	@Override
	public double CalculateTotal() {
		double total=0;
		for(OrderItem o:itemsList) {
			total = total +( o.getProduct().getProductPrice() * o.getQuantity());
		}
		return total;
	}

}
