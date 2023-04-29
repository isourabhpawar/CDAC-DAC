package com.fruitbaskate;

public class Fruit {

	private double weight;
	private String color;
	public Fruit(double weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	
	public Fruit fruitDetails()
	{System.out.println("---fruit class---");
		return  this ;
	}
	
	@Override
	public String toString() {
		return "Fruit [weight=" + weight + ", color=" + color + "]";
	}
	
 
	
	
}
