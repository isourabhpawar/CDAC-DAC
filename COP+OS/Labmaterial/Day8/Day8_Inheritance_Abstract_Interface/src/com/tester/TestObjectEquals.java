package com.tester;

import com.payroll.Manager;

public class TestObjectEquals {

	public static void main(String[] args) {
	 
		
		Date d1=new Date(12, 12, 2001);
		Date d2=new Date(12, 1, 2001);
		if(d1==d2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("NotEqual");
		}
		// Date d3=d1;
	System.out.println(d1.equals(d2));//Object obj=d2 //upcasting
		
		if(d1.equals(d2)==true)
		{System.out.println("d1==d2");
		}
		else
		{
			System.out.println("d1!=d2");
		}
		
		
		
		
		
		
		Manager  mgr=new Manager(12,"abc",90000,5000);
		
		System.out.println(d1.equals(mgr));//obj=mgr
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
