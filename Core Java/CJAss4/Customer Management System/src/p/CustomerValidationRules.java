package p;

import java.time.LocalDate;
import java.util.List;

public class CustomerValidationRules {

	public static Customer validateallinputs(String name, String email, String password, int registramount,
			String dob, Serviceplan plan, List<Customer> cust) throws CustomerHandlingException {

		Checkdupemail(email, cust);
		chkpass(password);
		LocalDate validdob =age21plus(dob);
		return new Customer(name, email, password, validdob, registramount, plan);
	}
	
	public static LocalDate age21plus(String dob) throws CustomerHandlingException {
		LocalDate Ldob=LocalDate.parse(dob);
		LocalDate years21=LocalDate.now().minusYears(21);
		if(years21.isBefore(Ldob))
			throw new CustomerHandlingException("Above 21 age permitted");
			
		return Ldob;
	}

	public static String chkpass(String pass) throws CustomerHandlingException {
		int countU = 0, countL = 0, countN = 0, countSC = 0;

		for (int i = 0; i < pass.length(); i++) {
			char c = pass.charAt(i);
			if ((int) c >= 65 && (int) c < 91) {
				countU++;
			}
			if ((int) c > 96 && (int) c < 123) {
				countL++;
			}
			if ((int) c > 47 && (int) c < 58) {
				countN++;
			}
			if ((int) c == 64 || (int) c > 32 && (int) c < 48) {
				countSC++;
			}
		}
		if (countU == 0 || countL == 0 || countN == 0 || countSC == 0 || pass.length() < 8) {
			throw new CustomerHandlingException("Weak password!!Password should contain atleast"
					+ "one uppercase,lowercase,specialchar(@$%&*.) & number(0-9)");
		}
		return pass;
	}

	public static String Checkdupemail(String email, List<Customer> custlist) throws CustomerHandlingException {
		Customer Custemail = new Customer(email);
		if (custlist.contains(Custemail))
			throw new CustomerHandlingException("Duplicate email found");
		return email;

	}

}
