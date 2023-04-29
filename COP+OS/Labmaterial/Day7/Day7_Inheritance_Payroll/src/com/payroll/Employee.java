package com.payroll;
//parent:Object
public class Employee {

	 private int empid;
	 private String name;
	 protected double salary;//accessible inside child/sub/derived class only
	 //constr
	public Employee(int empid, String name, double salary) {
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	//	super();
	}
	 
	
	
	public void calSalary()
	{
		System.out.println("---Employee Salary---"+salary);
	}
	
	public String toString()
	{
		return empid+"   "+name+"   "+salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
