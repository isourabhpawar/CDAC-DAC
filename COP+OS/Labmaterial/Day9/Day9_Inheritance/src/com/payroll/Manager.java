package com.payroll;

//base:Employee
public class Manager extends  Employee {
private double perfBonus;
//303,404,"Ramesh",50000,4000
	public Manager(int empid, int deptid, String name, double basicSalary,double perfBonus)
	{
		//super();
		super(empid,deptid,name,basicSalary);
		this.perfBonus=perfBonus;
		
	}
	
	
	//Manager specific method
	public void showPerBonus()
	{
		System.out.println("Manager PerBonus="+perfBonus);
	}
	
	@Override
	public String toString()
	{
		return  super.toString()+ "PerBonus:"+this.perfBonus;
	}
	
	
	
	//override computeNetsalary for calculating salary of Manager
	
	@Override
	public double computeNetSalary()
	{System.out.println("----Manager computeNetSalary--- ");
		return this.perfBonus+super.basicSalary;
	}
	
	
}
