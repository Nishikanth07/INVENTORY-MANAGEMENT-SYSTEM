package com.pre_scient.inventory_management.pojos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class SalesOrder implements Order {
	
	private Customer customer;
	private Date orderDate;
	private List<OrderItem> itemsList;
	
	

	public SalesOrder(Customer customer, Date orderDate, List<OrderItem> itemsList) {
		this.customer = customer;
		this.orderDate = orderDate;
		this.itemsList = new ArrayList<>();
	}
	
	

	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
		double total = 0;
		for(OrderItem o:itemsList) {
			total = total + (o.getProduct().getProductPrice()*o.getQuantity());
		}
		return total;
	}

}
