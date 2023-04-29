package com.code;

public class Product {
	//private :inside  class
	private int prdid;
	private String name;
	private double price;
	//constr
	public Product(int prdid, String name, double price) {
	 
		this.prdid = prdid;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPrdid() {
		return prdid;
	}
	
 
	//equality of 2 prds based on their price
	// p1.isSame(p2);
	public boolean isSame(Product  p)
	{
		//this holds ref of p1
		System.out.println("invoking isSame---");
		if(this.getPrice()==p.getPrice())
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	public String getProdDetails()
	{
		
		return "PrdId "+prdid+"  Name="+this.name+"    Price:"+this.price;
		
		
	}
	

}
