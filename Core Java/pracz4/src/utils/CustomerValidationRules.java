package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.iacsd.Customer;
import com.iacsd.ServicePlan;

import custom_exceptions.CustomerHandlingException;

public class CustomerValidationRules {
	// add a static method to invoke all validation rules
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan, List<Customer> customerList) throws CustomerHandlingException {
		checkForDup(customerList, email);
		ServicePlan servicePlan = parseValidatePlanAndRegAmount(plan, regAmount);
		LocalDate validDob = validateDob(dob);
		return new Customer(firstName, lastName, email, password, regAmount, validDob, servicePlan);
	}

//add a static method to check for dup
	public static void checkForDup(List<Customer> customerList, String newEmail) throws CustomerHandlingException {
		// 1. wrap email in customer ref.
		Customer newCustomer = new Customer(newEmail);
		if (customerList.contains(newCustomer))
			throw new CustomerHandlingException("Dup Email ID , choose new email !!!!!");
		System.out.println("no dup email found....");
	}

	// add a static method for plan parsing n validation
//	public static ServicePlan parseAndValidatePlan(String planName) throws IllegalArgumentException {
//		return ServicePlan.valueOf(planName.toUpperCase());
//	}
//
//	// add a static method to validate reg amount matching with the plan
//	public static void validateRegAmountForPlan(ServicePlan chosenPlan, double regAmount)
//			throws CustomerHandlingException {
//		if (chosenPlan.getPlanCost() != regAmount)
//			throw new CustomerHandlingException("Invalid reg amount for the chosen plan!!!!!");
//	}
	public static ServicePlan parseValidatePlanAndRegAmount(String planName, double regAmount)
			throws IllegalArgumentException, CustomerHandlingException {
		ServicePlan servicePlan = ServicePlan.valueOf(planName.toUpperCase());
		// => plan is valid
		if (servicePlan.getPlanCost() != regAmount)
			throw new CustomerHandlingException("Invalid reg amount for the chosen plan!!!!!");
		return servicePlan;
	}

	// add a static method for customer 's age validation
	public static LocalDate validateDob(String dob) throws CustomerHandlingException {
		// parsing
		LocalDate date = LocalDate.parse(dob);
		// => parsing successful
		int ageInYears = Period.between(date, LocalDate.now()).getYears();
		if (ageInYears > 21)
			return date;
		throw new CustomerHandlingException("Invalid DoB!!!!!!!!!!!!!!");
	}

	// add a static method customer's login
	public static Customer customerLogin(String email, String pass, List<Customer> custList)
			throws CustomerHandlingException {
		// search customer by email : PK
		int index = custList.indexOf(new Customer(email));
		if (index == -1)
			throw new CustomerHandlingException("Invalid Email , login failed!!!!");
		// valid email
		Customer validCustomer = custList.get(index);
		if (!validCustomer.getPassword().equals(pass))
			throw new CustomerHandlingException("Invalid Password , login failed!!!!");
		return validCustomer;
	}

}
