package com.app.fruits;


public class Apple extends Fruit{
	
	
	

	public Apple(String name, String color, double weight) {
		super(name, color, weight, true);
		// TODO Auto-generated constructor stub
	}

	public String taste() {
		return "Sweet and sour";
	}
	
	public String jam() {
		return this.getName()+" making Jam!!";
	}
	
	
}
