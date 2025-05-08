package com.pre_scient.inventory_management.pojos;

public class Category {
	private static int idCounter=1;
	private int categoryId;
	private String categoryName;
	private String categoryDescription;
	
	
	public Category() {
		this.categoryId = idCounter++;
	}

	public Category(int categoryId, String categoryName, String categoryDescription) {
		this.categoryId = idCounter++;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + "]";
	}
	
	
}
