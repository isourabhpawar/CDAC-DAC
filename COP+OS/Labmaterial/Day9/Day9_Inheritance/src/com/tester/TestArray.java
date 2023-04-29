package com.tester;

import com.payroll.Employee;
import com.payroll.Manager;
import com.payroll.Worker;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=null;
		System.out.println(e1);
		System.out.println(e1.computeNetSalary());
		
		int[] arr=new int[5];//0 0 0 0 0 
		
		Employee[] iacsd = new Employee[5];//null null null
		
		//base class can hold ref of derived class
		//UpCasting
		
		iacsd[0]=new Employee(205,34,"Minal",66000);
		Manager mgr=new Manager(203,34,"Mukesh",60000,4500);;
		
		iacsd[1]=mgr;
		iacsd[2]=new Worker(303, 90, "Sunil", 34444, 56, 100);

		for(Employee e:iacsd)
		{
			if(e!=null)
			{System.out.println(e.getClass());
			System.out.println(e);//
			System.out.println(e.computeNetSalary());
			//RTTI:RunTime Type Identification
			if(e instanceof Manager) {
			((Manager) e).showPerBonus();//DownCast Employee To Manager
			}
			
			}
		}
		
		
		
		
		
		
		
	}

}
