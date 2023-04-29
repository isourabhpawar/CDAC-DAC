package com.racing;

public class Nano extends Car {

	public Nano() {
		super();// super keyword parent class
		System.out.println("---nano default constr-----");
	}

	public Nano(int modelno, String color, String fuelType) {
		// by default super()
		super(modelno, color, fuelType);// parameter constr of Car class

		System.out.println("---nano parametr constr-----");

	}
	public void speed()
	{
		System.out.println("----speed of nano 80 km/hr-------");
		
		
	}

}
