package com.tester;

import com.payroll.Employee;
import com.payroll.Manager;
import com.payroll.SalesPerson;

public class TesterPayroll {

	public static void main(String[] args) {
		 Manager mgr=new Manager(101, "Manoj", 45000, 20000);
		 mgr.calSalary();//
		mgr.assignTaskToTeam();
		
		System.out.println("\n\n");
		
		Employee emp=new Employee(11,"Amit",10000);
		emp.calSalary();
		
		System.out.println("\n\n");
		//Base Class obj can hold ref of child class
		//compile time data type is Employee
		//run time data type is Manager
		Employee obj=new Manager(34,"Sumit",80000,15000);
		
		System.out.println(obj.getClass());
		obj.calSalary();//as per compiler calSalary () from employee
	
		
		
		
		if(obj instanceof Manager)
		{
		((Manager)obj).assignTaskToTeam();//downCast Employee object into Manager type
		
		}
		
		
		
		
		
		System.out.println("\n\n");
		SalesPerson sp=new SalesPerson(22, "Sunil", 23000, 1000, 2000, 2000);
		sp.calSalary();
		sp.targets();
		
		 
		
		

	}

}
