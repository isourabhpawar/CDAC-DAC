package com.payroll;

public class Employee {
//id(int), name, deptId , basicSalary(double)
	private int empid,deptid;
	private String name;
	protected double basicSalary;//make this visible  only in sub class
	//303,404,"Ramesh",50000 
	public Employee(int empid, int deptid, String name, double basicSalary) {
		super();
		
		this.empid = empid;
		this.deptid = deptid;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public Employee() {
		this.empid = 101;
		this.deptid = 10;
		this.name = "default";
		this.basicSalary = 1000;
	}

	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
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
	public double getBasicSalary() {
		return basicSalary;
	}
	//
	public double computeNetSalary(){
		System.out.println("Employee ComputeNetSalary");
		return 0;
		}
	
	
	
	 @Override//same fun name and same signature and return type
	public String toString() {
		 return "empid=" + empid + ", deptid=" + deptid + ", name=" + name + ", basicSalary=" + basicSalary
		 	;
	}
	
	
	//
}
