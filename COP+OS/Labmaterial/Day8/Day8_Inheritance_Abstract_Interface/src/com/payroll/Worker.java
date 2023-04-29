package com.payroll;

//Parent:Employee
public class Worker extends Employee{

	private double hrs,ratePerHr;

	public Worker(int empid, String name, double salary, double hrs, double ratePerHr) {
		super(empid, name, salary);
		this.hrs = hrs;
		this.ratePerHr = ratePerHr;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n  Worker [hrs=" + hrs + ", ratePerHr=" + ratePerHr + "]";
	}

	@Override
	public void calSalary() {
		// TODO Auto-generated method stub
		 System.out.println("Worker Salary="+(super.salary+(this.hrs*this.ratePerHr)));
	}
	//specific 
	public void calDailyRate()
	{
		System.out.println("Rate:"+this.ratePerHr);
	}
	
	
	
	
	
	
	
	
}
