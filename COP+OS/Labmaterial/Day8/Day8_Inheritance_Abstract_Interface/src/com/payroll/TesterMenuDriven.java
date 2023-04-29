package com.payroll;

import java.util.Scanner;

import com.pkg1.SalesPerson;

public class TesterMenuDriven  {

	public static void showEmpDEtails(Employee obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		final int a=10;//constant
	//	a=90;//error
		//a=600;//error
		System.out.println(
				"1 hire manager 2: hire worker 3: hire SalesPerson 4 :display all  5: show salary  6:update salary 7:exit");
		Scanner sc = new Scanner(System.in);
		int ch;
		int index = 0;
		Employee[] iacsd = new Employee[5];// null null null null null

		do {
			System.out.println("Enter Choice=");
			ch = sc.nextInt();
			switch (ch) {
			case 1:// add Manager
				if (index < iacsd.length) {
					System.out.println("Empid Name Salary PerBonus");
					Manager mgr = new Manager(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
					iacsd[index] = mgr;
					 
					index++;

				} else {
					System.out.println("Array Full ");
				}
				break;
			case 2:// add worker

				if (index < iacsd.length) {
					System.out.println("EmpId Name Salary hrs rate");
					iacsd[index] = new Worker(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
					index++;

				}

				else {
					System.out.println("Array Is Full");
				}
				break;

			case 3:// salesPerson

				if (index < iacsd.length) {
					System.out.println("Empid Name Salary allounces");
					iacsd[index] = new SalesPerson(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
					index++;
				} else {
					System.out.println("Array Full ");
				}
				break;
			case 4:
				for (Employee e : iacsd) {
					if (e != null)
					{System.out.println(e);
					
						if(e instanceof Manager)
							((Manager)e).displayPerBonus();
						else if(e instanceof Worker)
							((Worker)e).calDailyRate();
					}
						
				}
				break;
			case 5:
				for (Employee e : iacsd) {
					if (e != null) {
						if(e  instanceof Manager)
						{
						System.out.println("RunTime Data Type:" + e.getClass());
						e.calSalary();// compile time Employee run time ref of Derived class
					}}
				}
				break;

			case 6:
				System.out.println("Enter EmpId ");
				int id = sc.nextInt();
				for (Employee emp : iacsd) {
					if(emp!=null)
					{
					if(emp.getEmpid()==id)
					{
						 
						System.out.println("Enter Amount");
						emp.incrementSalary(sc.nextDouble());
						System.out.println("salary Incremented:"+emp.getSalary());
					break;
					}
					}

				}
				break;

			}
		} while (ch != 7);

	}

}
