package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojos.Employee;
import pojos.EmploymentType;

public class AddEmpToDepartment {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			EmployeeDao dao = new EmployeeDaoImpl();
			System.out.println("Enter emp details : firstName,  lastName,  email,  "
					+ "password,  confirmPassword, joinDate,  type,  salary");
			Employee newEmp = new Employee(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
					LocalDate.parse(sc.next()), EmploymentType.valueOf(sc.next().toUpperCase()), sc.nextDouble());
			System.out.println("Enter dept id");
			System.out.println(dao.addNewEmployee(newEmp, sc.nextLong()));
		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
