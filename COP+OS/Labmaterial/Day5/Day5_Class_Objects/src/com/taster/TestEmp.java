package com.taster;

import com.code.Employee;

public class TestEmp {

	public static void main(String[] args) {
		 
		Employee emp1=new Employee(101, "Chetan", 45555);//contr 
		emp1.displayEmp();
		
		Employee emp2=new Employee(102, "Chetana", 45555);//contr 
		emp2.displayEmp();
	
		 
		for(int i=1;i<=10;i++)
		{
			Employee e=new Employee(103, "Xyz", 9000);
		}

		
		//get total emp creatde
		
		Employee.getEmpCount();//
		emp1.displayEmp();
		emp2.displayEmp();//empCounter
		
		
	}

}
