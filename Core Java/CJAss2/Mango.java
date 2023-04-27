package com.app.fruits;

public class Mango extends Fruit{

	
	
	public Mango(String name, String color, double weight) {
		super(name, color, weight, true);
		// TODO Auto-generated constructor stub
	}


	public String taste() {
		return "Sweet";
	}

	
	public String pulp() {
		return this.getName()+" "+ this.getColor()+" Creating Pulp!!";
		
	}
	
	
	
	
}
