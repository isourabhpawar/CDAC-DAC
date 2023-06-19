package tester;

import org.hibernate.SessionFactory;

import dao.DepartmentDao;
import dao.DepartmentDaoImpl;
import pojos.Department;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

public class AddNewDepartment {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			DepartmentDao dao = new DepartmentDaoImpl();
			System.out.println("Enter dept details : name n location");
			System.out.println(dao.launchNewDept
					(new Department(sc.next(), sc.next())));
		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
