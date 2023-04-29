package com.fruitbaskate;

public class Mango extends Fruit {

	private String mangoType;

	public Mango(double weight, String color, String mangoType) {
		super(weight, color);
		this.mangoType = mangoType;
	}

	public Mango fruitDetails()
	{System.out.println("---mango class---");
		return  this ;
	}
	
	
	public void pulp()
	{
		System.out.println("Mango pulp can get created");
	}
	
	@Override
	public String toString() {
		return  super.toString()+  "Mango [mangoType=" + mangoType + "]";
	}
	
	
}
