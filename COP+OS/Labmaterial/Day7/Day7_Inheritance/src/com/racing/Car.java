package com.racing;

public class Car {
	//common data  members
	private int modelno;
	private String color;
	private String fuelType;
	
	
	public Car(int modelno,String color,String fuelType)
	{
		System.out.println("----Car Parameter constr----");
		this.modelno=modelno;
		this.color=color;
		this.fuelType=fuelType;
		
	}
	
	public Car()
	{//object class 
		System.out.println("--car default constr----");
		modelno=1;
		color="white";
		fuelType="petrol";
		
	}
	public void speed()
	{
		System.out.println("----speed of car 60 km/hr-------");
		
		
	}

	public void carDetails()
	{
		System.out.println(modelno+"    "+color+"   "+fuelType);
	}
	
	@Override
	public String toString()
	{
		return modelno+"   "+color+"    "+fuelType;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
