package tester;

import org.hibernate.SessionFactory;

import dao.DepartmentDao;
import dao.DepartmentDaoImpl;
import pojos.Department;
import pojos.Employee;
import pojos.EmploymentType;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class AddNewDepartmentWithEmps {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			DepartmentDao dao = new DepartmentDaoImpl();
			System.out.println("Enter dept details : name n location");
			Department newDept = new Department(sc.next(), sc.next());
			for (int i = 0; i < 2; i++) {
				System.out.println("Enter emp details : firstName,  lastName,  email,  "
						+ "password,  confirmPassword, joinDate,  type,  salary");
				Employee newEmp = new Employee(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
						LocalDate.parse(sc.next()), EmploymentType.valueOf(sc.next().toUpperCase()), sc.nextDouble());
				newDept.addEmployee(newEmp);
			}
			System.out.println(dao.launchNewDept(newDept));
		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
