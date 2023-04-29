package com.pkg1;

import com.payroll.Employee;

public class SalesPerson  extends Employee{
private double allounces;
	public SalesPerson(int empid, String name, double salary,double allounces) {
		super(empid, name, salary);
		this.allounces=allounces;
				
		// TODO Auto-generated constructor stub
	}

	public void calSalary()
	{
		
		System.out.println("SalesPerson Salary="+(super.salary+allounces));
		
	}
}
