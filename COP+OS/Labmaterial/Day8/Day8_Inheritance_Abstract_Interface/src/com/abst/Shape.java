package com.abst;

public  abstract class Shape {
	//abstract method:with no implenentation
	public abstract  void area();
	//abstract class can contain implemented methods(non abstract)
	public void dislay()
	{
		System.out.println("non abstract method from shape class");
	}

}
//abstract class instance can not get created
//abstract class can contain abstract methods
//abstract methods are methods with no implementation
//can we use abstract :Yes,How:inherit abstract class 