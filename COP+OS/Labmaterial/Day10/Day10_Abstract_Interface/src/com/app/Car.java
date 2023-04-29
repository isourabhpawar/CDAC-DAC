package com.app;

public abstract class Car {
	
	private int modelno;
	private String color;
	public abstract void speed(); //must be implemented by child class

	public Car()
	{   System.out.println("--default Car constr---");
		modelno=10;
		color="white";
	}
	public Car(int modelno,String color)
	{   System.out.println("--para Car constr---");
		this.modelno=modelno;
		this.color=color;
	}
	
	//getter setter
	
	
	public Car getCarDetails()
	{return this;
		
	}

	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", color=" + color + "]";
	}

	 
	
	
	
}
