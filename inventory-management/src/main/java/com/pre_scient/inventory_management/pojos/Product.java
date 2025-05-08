package com.pre_scient.inventory_management.pojos;

public class Product {
	private static int idCounter=1;
	private int productId;
	private String prouductName;
	private String productDescription;
	private Category category;
	private int quantityStock;
	private double productPrice;
	
	
	
	public Product() {
		this.productId = idCounter++;
	}



	public Product(int productId, String prouductName, String productDescription, Category category, int quantityStock,
			double productPrice) {
		this.productId = idCounter++;
		this.prouductName = prouductName;
		this.productDescription = productDescription;
		this.category = category;
		this.quantityStock = quantityStock;
		this.productPrice = productPrice;
	}



	public int getProductId() {
		return productId;
	}


	public String getProuductName() {
		return prouductName;
	}


	public void setProuductName(String prouductName) {
		this.prouductName = prouductName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public int getQuantityStock() {
		return quantityStock;
	}


	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	
	
}
