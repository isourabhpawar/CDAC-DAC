package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDao;
import dao.AddressDaoImpl;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojos.Address;
import pojos.Employee;
import pojos.EmploymentType;

public class AssignAddressToExistingEmp {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			AddressDao dao = new AddressDaoImpl();
			System.out.println("Enter adr details : adrLine1 adrLine2,  city,  state,  country,  zipCode) ");
			Address newAdr = new Address(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println("Enter emp id");			
			System.out.println(dao.assignAddressToEmp(newAdr,sc.nextLong()));
		} // sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
