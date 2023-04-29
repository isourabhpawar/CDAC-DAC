package com.payroll;


//parent:Employee 
public class Manager  extends Employee{
	private int incentives;
	
	//default
	public Manager()
	{
		incentives=100;
	}
	
	public Manager(int empid,String name,double salary,int incentives)
	{
		super(empid,name,salary);
		this.incentives=incentives;
		
		
		
	}

	
	@Override
	public void calSalary() {
		// TODO Auto-generated method stub
		System.out.println("---Manager Salary----"+(super.salary+this.incentives));
	}
	
	public void assignTaskToTeam() {
		System.out.println("----Manager Specific Function");
	}
	
	
	public String toString()
	{
		return super.toString()+"   "+incentives;
	}
	
	
	
	
	
}
