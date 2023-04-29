package com.tester;

import com.app.Employee;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=200;
		System.out.println(a);//200
		//DataType varName
		Employee emp;//emp will get stored on stack
		emp=new Employee();//mem will get allocated on heap
		//ref get stored inside emp on stack
		//emp.display();
		System.out.println(emp);//101 Ram Pune 10000
	
		Employee e2=new Employee(202,"Sham","mumbai",80000);//
		System.out.println(e2);
		
		System.out.println(emp.hashCode() +"     "+e2.hashCode());
		
		Employee e3;
		e3=emp;
		System.out.println(e3.hashCode());
		emp=null;
		System.out.println(e3);
		System.out.println(emp);
		emp.display();
		
		
		
		
		
		
		
		
	}

}
