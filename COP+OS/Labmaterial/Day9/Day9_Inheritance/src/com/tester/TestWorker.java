package com.tester;

import com.payroll.Manager;
import com.payroll.Worker;

public class TestWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker w=new Worker(106,12,"Suresh",20000,20,1000);
		System.out.println(w);
		System.out.println(w.computeNetSalary());
		
//		Manager mgr = new Manager(303, 404, "Ramesh", 50000, 4000);// object--->Employee---->Manager
//		System.out.println(mgr);// employee toString--->Manager toString()
//		System.out.println(mgr.computeNetSalary());

		
		
		
		
	}

}
