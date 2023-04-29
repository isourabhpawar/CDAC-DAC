package com.app;

public abstract class Shape {
	//can we write constructor:YES
	
	public Shape()
	{
		System.out.println("---Shape Class default constr----");
	}
	
	
//abstract class can contain non abstract method
	public void display()
	{
		System.out.println("Display Is Implemeneted method in Shape class");
	}
	
	//abstract class contains abstract method
	public abstract void area();
	
	//final method
	public final void impMethod()
	{
		System.out.println("This is final Method in Shape class");
	}

public static void show()
{
	System.out.println(" static method in shape class---");
}



}
