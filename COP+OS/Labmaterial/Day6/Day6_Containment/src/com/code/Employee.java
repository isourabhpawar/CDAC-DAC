package com.code;

public class Employee {

	private int empid;
	private String name;
	private Date dob;
	
	public Employee()
	{System.out.println("----emp default----");
	empid=10;
	name="Ram";
	dob=new Date();//default values to dob 
		
	}
	
public  Employee(int empid,String name,Date dob)
{
	this.empid=empid;
	this.name=name;
	this.dob=dob;
			
}
	
	
	public void dsiplay()
	{
		System.out.println("EmpId="+empid);
		System.out.println("Name="+name);
		System.out.println("Dob="+dob);
			
	}
	
	//override toString Method
	public String toString()
	{
		return ""+empid+"  "+name+"  "+dob;
	}
	
}













