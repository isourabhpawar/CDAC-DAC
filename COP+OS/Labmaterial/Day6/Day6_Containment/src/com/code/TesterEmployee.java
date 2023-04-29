package com.code;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		 System.out.println(emp);
		//emp.dsiplay();
		 
		 int id=101;
		 String name="Minal";
		 int d=9,m=11,y=1995;
		 Date dob=new Date(d,m,y);
		 
		 Employee emp2=new Employee(id, name, dob);
		 
		 
		 Employee emp3=new Employee(404, "Nita", new Date(4,5,1988));
		 System.out.println(emp3);
		 
		 
		 
		 
		 
		 
	}

}
