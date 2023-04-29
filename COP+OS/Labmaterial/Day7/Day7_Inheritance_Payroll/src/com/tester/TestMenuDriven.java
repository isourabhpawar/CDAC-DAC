package com.tester;

import java.util.Scanner;

import com.payroll.Employee;
import com.payroll.Manager;
import com.payroll.SalesPerson;

public class TestMenuDriven {

	public static void main(String[] args) {

		System.out.println("1:Add Manager");
		System.out.println("2:Add SalesPerson");
		System.out.println("3:calSalary");
		System.out.println("4:Show All Employee");

		Scanner sc = new Scanner(System.in);
		int ch;
		int index = 0;
		// create an array Of Employee
		Employee[] iacsd = new Employee[5];

		do {
			System.out.println("Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < iacsd.length) {
					System.out.println("Enter Manager Details");
					System.out.println("EmpId Name Salary Incentives");
					Manager mgr = new Manager(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
					iacsd[index] = mgr;
					index++;
					System.out.println("Manager Added");
				} else {
					System.out.println("array is full");
				}
				break;
			case 2:
				if (index < iacsd.length) {
					System.out.println("Enter SalesPerson Details");
					System.out.println("EmpId Name Salary PA,TA,FA");

					iacsd[index] = new SalesPerson(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt(),
							sc.nextInt());
					index++;
					System.out.println("salesPerson Added");
				} else {
					System.out.println("array is full");
				}

				break;
			case 3:
				for(Employee e:iacsd)
				{
					if(e!=null)
					{
						e.calSalary();//compile time Employee.calSalary()
					}
				}
				break;
			case 4:
				for(Employee e:iacsd)
				{
					if(e!=null)
					{
						System.out.println(e);
					}
				}
				break;
				
			default:
				break;
			}

		} while (ch != 5);

	}

	
	
	
	
	
	
}
