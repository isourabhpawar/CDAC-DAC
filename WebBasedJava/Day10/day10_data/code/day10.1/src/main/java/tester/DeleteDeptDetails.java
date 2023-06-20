package tester;

import org.hibernate.SessionFactory;

import dao.DepartmentDao;
import dao.DepartmentDaoImpl;
import pojos.Department;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

public class DeleteDeptDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) {
			DepartmentDao dao = new DepartmentDaoImpl();
			System.out.println("Enter dept name");
			System.out.println(dao.deleteDeptDetails(sc.next()));
		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
