package tester;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;
import pojos.Employee;
import pojos.EmploymentType;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class GetAllEmpDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) // invoking static method -->
		// cls loading --> static init block --> configure : entire hib frmwork loaded
		{
			// create dao instance
			EmployeeDaoImpl dao = new EmployeeDaoImpl();
			System.out.println("List of all emps : ");
			dao.getAllEmps().forEach(System.out::println);

		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
