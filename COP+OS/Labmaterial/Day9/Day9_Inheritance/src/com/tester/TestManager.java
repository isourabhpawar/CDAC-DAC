package com.tester;

import com.app.Employee;
import com.payroll.Manager;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();

		Manager mgr = new Manager(303, 404, "Ramesh", 50000, 4000);// object--->Employee---->Manager
		System.out.println(mgr);// employee toString--->Manager toString()
		System.out.println(mgr.computeNetSalary());

	}

}
