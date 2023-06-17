package tester;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;
import pojos.Employee;
import pojos.EmploymentType;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class AddEmpDetailsWithGetCurntSession {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)) // invoking static method -->
		// cls loading --> static init block --> configure : entire hib frmwork loaded
		{
			//create dao instance
			EmployeeDaoImpl dao=new EmployeeDaoImpl();
			System.out.println(
					"Enter emp details : firstName,  lastName,  email,  "
					+ "password,  confirmPassword, joinDate,  type,  salary");
			Employee newEmp = new Employee(sc.next(), sc.next(), 
					sc.next(), sc.next(), sc.next(),
					LocalDate.parse(sc.next()), 
					EmploymentType.valueOf(sc.next().toUpperCase()), 
					sc.nextDouble());
			System.out.println(dao.insertEmployeeDetailsCurrentSession(newEmp));
			
		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
