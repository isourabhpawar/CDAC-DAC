package com.payroll;

public class Worker extends Employee{
private int hoursWorked,hourlyRate;

public Worker(int empid, int deptid, String name, double basicSalary, int hoursWorked, int hourlyRate) {
	super(empid, deptid, name, basicSalary);
	this.hoursWorked = hoursWorked;
	this.hourlyRate = hourlyRate;
}



@Override
public double computeNetSalary() {
	// TODO Auto-generated method stub
	System.out.println("---Worker ComputeNetSalary-------");
	return super.basicSalary+this.hourlyRate*this.hoursWorked;
}



@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+" hoursWorked "+hoursWorked +"    "+hourlyRate;
}

 


}
