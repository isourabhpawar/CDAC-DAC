package com.app;
//java.lang.Object is parent class
public class Employee {

	//
	private int empid;
	private String name,city;
	private double salary;
	public Employee(int empid, String name, String city, double salary) {
		
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public Employee() {
		
		this.empid = 101;
		this.name = "Ram";
		this.city = "Pune";
		this.salary = 10000;
	
	}
	
	//constr:to initialise data members
	
	public void display()
	{
		System.out.println( empid+"   "+name+"   "+city+"  "+salary);
	}
	//getters setters
	
	
	//toString()
	//overriding
	
	public String toString()
	{
	return  empid+"   "+name+"   "+city+"  "+salary;	
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpid() {
		return empid;
	}
	public double getSalary() {
		return salary;
	}
	
	
	
	
	
	
	
	
	
}
