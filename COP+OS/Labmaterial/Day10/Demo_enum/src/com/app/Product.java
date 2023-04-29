package com.app;

public class Product {

	
	private int prdid;
	private String name;
	private double price;
	//prd will category
	private Category category;
	
	public Product(int prdid,String name,double price,Category category)
	{
		
		this.prdid=prdid;
		this.name=name;
		this.price=price;
		this.category=category;
		
	}

	@Override
	public String toString() {
		return "Product [prdid=" + prdid + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}
