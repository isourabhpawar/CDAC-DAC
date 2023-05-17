package utils;

import static com.iacsd.ServicePlan.GOLD;
import static utils.CustomerValidationRules.validateAllInputs;

import java.util.ArrayList;
import java.util.List;

import com.iacsd.Customer;

import custom_exceptions.CustomerHandlingException;

public class CMSUtils {
//add a static method to return populated list of customers , with sample data
	public static List<Customer> populateList() throws CustomerHandlingException {
		List<Customer> customers = new ArrayList<>();
		/*
		 * String firstName, String lastName, String email, String password, double
		 * regAmount, String dob, String plan, List<Customer> customerList
		 */
		customers.add(
				validateAllInputs("Kiran", "Seth", "kiran@gmail.com", "3456", 2000, "1989-12-20", "gold", customers));
		customers.add(
				validateAllInputs("Rama", "Kher", "rama@gmail.com", "12345", 1000, "1989-12-20", "silver", customers));
		customers.add(validateAllInputs("Shubham", "Vaidya", "shubham@gmail.com", "2345", 2000, "1997-11-21", "gold",
				customers));
		customers.add(validateAllInputs("Meera", "Savant", "meera@gmail.com", "2445", 5000, "1989-12-20", "diamond",
				customers));
		customers.add(
				validateAllInputs("Mihir", "Rao", "mihir@gmail.com", "2245", 2000, "1999-11-24", "gold", customers));
		customers.add(validateAllInputs("Kunal", "Singh", "kunal@gmail.com", "2845", 10000, "1998-01-25", "platinum",
				customers));
		return customers;
	}
}
