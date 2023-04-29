package com.code;

public class Account {
	//auto increment of accountid using static concept
	
	
	private int actid;//instance variable
	private String name;
	private double balnace;
	//create a static variable for incrementing actid
	private static int idCounter;
	//starts idCounter by 1000
	static
	{
		System.out.println("---static---");
		idCounter=1000;
		
	}
	//
	public Account(String name,double balance)
	{
		//increment actidCounter(static) and then assign it to instance variable actid
		
		idCounter++;
		this.actid=idCounter;
		this.name=name;
		this.balnace=balance;
		System.out.println("---constr-----");
			
	}
	
	public void display()
	{
		System.out.println(actid+"   "+name+"   "+balnace);
	}
	
	
	

}
