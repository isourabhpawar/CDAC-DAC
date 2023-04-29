package com.fruitbaskate;

public class Orange extends Fruit {

	public Orange(double weight, String color) {
		super(weight, color);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Orange fruitDetails() {
		// TODO Auto-generated method stub
		return this;;
	}


	public void juice()
	{
		System.out.println(" Orange Juice can get created");
	}
	
}
