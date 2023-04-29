package com.payroll;

public class Employee {
//private
	private int empid;
	private String name;
	protected double salary;//outside class inside package:visible outside class otside package:but inside child class only
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	//final method:derived class can not override final method 
	public  final void calIncomeTax()
	{
		System.out.println("Income Tax Calculation In Employee");
	}
	public void incrementSalary( double amount)
	{
		this.salary=this.salary+amount;
	}
	
	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}


	public void calSalary()
	{
		System.out.println("Employee Salary="+salary);
		
	}
//	public Employee( ) {
//		super();
//	}
	@Override
	public String toString() {
		
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
