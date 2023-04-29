package com.payroll;
//Parent:Employee
public final class Manager extends Employee
{
	private  double perBonus;

	public Manager(int empid, String name, double salary,double perBonus) {
		super(empid, name, salary);
		 this.perBonus=perBonus;
		
	}

	@Override
	public String toString() {
		return super.toString()+ "\n Manager [perBonus=" + perBonus + "]";
	}

	@Override
	public void calSalary()
	{
		System.out.println("Manager Salary="+(super.salary+perBonus));
	}
	
	
	 //error:Cannot override the final method from Employee
//	public void calIncomeTax() {
//		// TODO Auto-generated method stub
//		//super.calIncomeTax();
//	}

	//manager speciif  function
	 public void displayPerBonus()
	{
		System.out.println("Manager PerBonus="+this.perBonus);
	}
	
	
	
	
	
	
	
}
