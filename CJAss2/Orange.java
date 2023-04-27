package com.app.fruits;

public class Orange extends Fruit{
	
	
	

	public Orange(String name, String color, double weight) {
		super(name, color, weight, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orange []";
	}

	public String taste() {
		return "sour";
	}
	
	public String juice() {
		return this.getName()+" "+ this.getWeight()+" extracting Juice!!";
	}
	
	
}