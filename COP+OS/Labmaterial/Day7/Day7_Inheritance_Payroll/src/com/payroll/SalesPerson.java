package com.payroll;

public class SalesPerson extends Employee{
private int pa,fa,ta;

public SalesPerson(int empid,String name,double salary,int ta,int pa,int fa )
{
	super(empid,name,salary);
	this.pa=pa;
	this.fa=fa;
	this.ta=ta;
}
@Override
public void calSalary()
{
	System.out.println("SalesPerson Salary-----"+(super.salary+pa+ta+fa));
}

public void targets()
{
	System.out.println("---sales person specific task-----");
}


public String toString()
{
	return super.toString()+"   "+pa+"  "+ta+"     "+fa;
}










}
