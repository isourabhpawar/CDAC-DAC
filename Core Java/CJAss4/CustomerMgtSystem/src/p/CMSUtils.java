package p;
import static p.CustomerValidationRules.validateallinputs;

import java.util.ArrayList;
import java.util.List;



public class CMSUtils {
	//add a static method to return populated list of customers , with sample data
		public static List<Customer> populateList() throws CustomerHandlingException {
			List<Customer> customers = new ArrayList<>();
			/*
			 * String firstName, String lastName, String email, String password, double
			 * regAmount, String dob, String plan, List<Customer> customerList
			 */
			customers.add(
					validateallinputs("Kiran", "kiran@gmail.com", "34Assdada@56", 2000, "1989-12-20", "gold", customers));
			customers.add(
					validateallinputs("Rama", "rama@gmail.com", "123Aasda@45", 1000, "1990-11-01", "silver", customers));
			customers.add(validateallinputs("Shubham",  "shubham@gmail.com", "2DSD@q345", 2000, "1997-11-21", "gold",
					customers));
			customers.add(validateallinputs("Meera", "meera@gmail.com", "244F!@SDs25", 5000, "1997-11-21", "diamond",
					customers));
			customers.add(
					validateallinputs("Mihir",  "mihir@gmail.com", "224Dadsss#5", 2000, "1999-11-24", "gold", customers));
			customers.add(validateallinputs("Kunal",  "kunal@gmail.com", "28Dsasd$45", 10000, "1998-01-25", "platinum",
					customers));
			return customers;
		}
	}

	
	
	


