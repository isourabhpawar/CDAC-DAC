package com.code;

public class Employee {
	private   int empid;//instance variable
	private String name;//instance var

	private double salary;//instancevar
	
	public static int empCounter;

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		
		//as new object get created increment empCounter
		
		empCounter=empCounter+1;
				
	}
	public static void getEmpCount()
	{
		System.out.println("Total Emp created:"+empCounter);
	}
	
	public void displayEmp()
	{
		System.out.println(empid +"  "+name +"   "+salary+"   Total Emp Created:"+empCounter);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
