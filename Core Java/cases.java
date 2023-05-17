package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.iacsd.ServicePlan;
import com.app.iacsd.Customer;

import custom_exceptions.CustomerHandlingException;
import utils.CustomerValidationRules;


public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// create empty AL to hold customer refs
			List<Customer> customerList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all " + "4. Change Password 5.Unsubscribe customer");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:// customer reg.
						System.out.println(
								"Enter customer details :  firstName,  lastName,  email,  password,  regAmount,  dob service Plan");
						Customer validCustomer = CustomerValidationRules.validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(validCustomer);
						System.out.println("customer registered....");

						break;
					case 2: // sign in
						System.out.println("Enter email n password");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						System.out.println(validCustomer);
						break;

					case 4:  //change password
						System.out.println("Enter email , old pwd , new pwd");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						//=> valid login
						validCustomer.setPassword(sc.next());
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// read off pending token from the scanner till EOL (end of line)
					sc.nextLine();
				}
			}
		}

	}

}


==========================================================================================================================





productList.forEach(p -> System.out.println(p));
		// Sort the products in the list as per date : custom ordering
		Collections.sort(productList, (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		System.out.println("Sorted  list as per date");
		productList.forEach(p -> System.out.println(p));
		String s = "hello";// s : literal string
		int data = 100;// int literal
		// Function literal => assigning a functionality to a variable
		// price based desc sorting
		Comparator<Product> productComp = 
				(p1, p2) -> ((Double) p2.getPrice()).compareTo(p1.getPrice());
		Collections.sort(productList, productComp);//higher order func using func literal
		System.out.println("Sorted  list as per price desc");
		productList.forEach(p -> System.out.println(p));
		

==========================================================================================================================

package tester;

import static utils.CMSUtils.populateList;
import static utils.CustomerValidationRules.customerLogin;
import static utils.CustomerValidationRules.validateAllInputs;
import static utils.CustomerValidationRules.Unsubsribe;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.iacsd.Customer;

import custom_exceptions.CustomerHandlingException;

public class CustomerManagementSystem {

	public static void main(String[] args) throws CustomerHandlingException {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// create empty AL to hold customer refs
			List<Customer> customerList = populateList();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all " + "4. Change Password 5.Unsubscribe customer"
								+ "6. Sort customers as per email 7. Sort customers as per date n reg amount");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:// customer reg.
						System.out.println(
								"Enter customer details :  firstName,  lastName,  email,  password,  regAmount,  dob service Plan");
						Customer validCustomer = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(),sc.next(), customerList);
						customerList.add(validCustomer);
						System.out.println("customer registered....");

						break;
					case 2: // sign in
						System.out.println("Enter email n password");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						System.out.println(validCustomer);
						break;

					case 3:
						System.out.println("All customers ");
						for (Customer c : customerList)
							System.out.println(c);
						break;

					case 4: // change password
						System.out.println("Enter email , old pwd , new pwd");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						// => valid login
						validCustomer.setPassword(sc.next());
						break;
					case 6:
						Collections.sort(customerList);
						break;
					case 7:
						Collections.sort(customerList, new Comparator<Customer>() {
							@Override
							public int compare(Customer c1, Customer c2) {
								// dob based
								int ret = c1.getDob().compareTo(c2.getDob());
								if (ret == 0) {
									// reg amount based sorting
//									if (c1.getRegAmount() < c2.getRegAmount())
//										return -1;
//									if (c1.getRegAmount() == c2.getRegAmount())
//										return 0;
//									return 1;
									return ((Double)c1.getRegAmount()).compareTo(c2.getRegAmount());
								}
								return ret;
							}
						}

						);

						break;

					case 0:
						exit = true;
						break;
					case 8:
						Unsubsribe( customerList);
					}
				} catch (Exception e) {
					e.printStackTrace();
					// read off pending token from the scanner till EOL (end of line)
					sc.nextLine();
				}
			}
		}

	}

}

==========================================================================================================================


package tester;

import java.util.Map;
import java.util.Scanner;

import com.banking.AcctType;
import com.banking.BankAccount;

import custom_exceptions.BankingException;

import static utils.BankUtils.*;
import static utils.BankValidations.*;

public class TestBanking {

	public static void main(String[] args) throws BankingException {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map from utils
			Map<Integer, BankAccount> acctMap = populateMap();

			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2. Display all accounts 3. Transfer Funds "
						+ "4.Close A/c 5. Fetch A/c Summary " + "6.Display names by acct type 16.Freeze A/cs 0.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter acct details :  acctNo,  customerName,  type,  balance,  createdOn(yr-mon-day)");
						BankAccount account = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), acctMap);
						acctMap.put(account.getAcctNo(), account);
						System.out.println("new a/c created....");
						break;

					case 2:// display acct details (admin)
						System.out.println("Accts in the bank : ");
						for (BankAccount a : acctMap.values())
							System.out.println(a);
						break;
					case 3: // fund transfer (customer)
						System.out.println("Enter src a/c no , dest a/c no n transfer amount");
						// get src a/c
						BankAccount src = acctMap.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid src acct no!!!!!!!!!!!");
						BankAccount dest = acctMap.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid dest acct no!!!!!!!!!!!");
						// transfer the funds
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("funds transferred.....");
						break;
					case 4:
						System.out.println("Enter a/c no , to close the a/c");
						account = acctMap.remove(sc.nextInt());
						if (account == null)
							throw new BankingException("Invalid  acct no, Can't close A/c !!!!!!");
						System.out.println("Closed " + account);
						break;
					case 5:
						System.out.println("Enter a/c no to fetch a/c summary");
						System.out.println(fetchAccountSummary(sc.nextInt(), acctMap));
						break;
					case 6:
						System.out.println("Enter acct type");
						AcctType acctType = parseAndValidateType(sc.next());
						//search criteria : acct type --key based or value based --> value based 
						//limitation : only key based searching in Map api
						//soln : convert Map --> Collection<V> : values
						for(BankAccount a : acctMap.values())
							if(a.getType()==acctType)
								System.out.println(a.getCustomerName());
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} // sc.close() : JVM

	}

}

===================
Validations->


package utils;

import java.time.LocalDate;
import java.util.Map;

import com.banking.AcctType;
import com.banking.BankAccount;

import custom_exceptions.BankingException;

public class BankValidations {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	// validate all inputs
	public static BankAccount validateAllInputs(int acctNo, String customerName, 
			String type, double balance, String createdOn,Map<Integer,BankAccount> accts) throws BankingException
	{
		checkForDup(acctNo,accts);
		validateBalance(balance);
		AcctType acctType = parseAndValidateType(type);
		LocalDate creationDate = parseCreationDate(createdOn);
		return new BankAccount(acctNo, customerName, acctType, balance, creationDate);
		
	}

	// no dups check : HOW : containsKey
	public static void checkForDup(int acctNo, Map<Integer, BankAccount> accts) throws BankingException {
		if (accts.containsKey(acctNo))// auto boxing --> up castng : O(1)
			throw new BankingException("Dup A/C no !!!!!!!!!!!!!");
	}

//add a static method to validate balance
	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Min balance reached !!!!");

	}

	// add a static method for parsing n validating ac ype
	public static AcctType parseAndValidateType(String acctType) {
		return AcctType.valueOf(acctType.toUpperCase());
	}

	// add a static method for parsing date
	public static LocalDate parseCreationDate(String date) {
		return LocalDate.parse(date);// yyyy-MM-dd
	}
}

========================================================================================================


package tester;

import static utils.ShowroomUtils.populateShowroom;
import static utils.VehicleValidationRules.parseAndValidateColor;
import static utils.VehicleValidationRules.parseAndValidateDate;
import static utils.VehicleValidationRules.validateAllInputs;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// create empty AL : to store vehicle refs
			List<Vehicle> showroom = populateShowroom();// size=0, init capa=1000
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options 1. Add a Vehicle 2. Display all "
						+ "3. Get specific vehicle details 4. Apply discount  "
						+ "5. Delete vehicle details  by ch no 6. Delete vehicles by color " + "0.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1: // add a new vehicle
						System.out.println(
								"Enter vehicle details : chasisNo,  vehicleColor,  netPrice,  manufactureDate(yr-mon-day),  company");
						Vehicle validVehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), showroom);
						showroom.add(validVehicle);
						System.out.println("vehicle added.....");
						break;
					case 2:
						System.out.println("Showroom contents : ");
						for (Vehicle v : showroom)
							System.out.println(v);
						break;
					case 3:
						System.out.println("Enter chasis no");
						// showroom : [v1,v2,v3...v10....]
						Vehicle vehicle = new Vehicle(sc.next());
						int index = showroom.indexOf(vehicle);// O(n)
						if (index == -1)
							throw new VehicleHandlingException("Invalid ch no , Vehicle not found!!!!!!!!!!!");
						// => vehicle found
						System.out.println(showroom.get(index));// toString : O(1)
						break;

					case 4:
						System.out.println("Enter date n discount amount");
						LocalDate date = parseAndValidateDate(sc.next());
						double discount = sc.nextDouble();
						// search by date (non PK based)
						for (Vehicle v : showroom)
							if (v.getManufactureDate().isBefore(date))
								v.setNetPrice(v.getNetPrice() - discount);
						System.out.println("discount applied....");
						break;
					case 5:
						System.out.println("Enter chasis no , to delete vehicle details");
						index = showroom.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							throw new VehicleHandlingException(
									"Invalid ch no , Vehicle not found, can't be removed !!!!!");
						System.out.println("Removed " + showroom.remove(index));
						break;

					case 6:
						System.out.println("Enter color");
						Color chosenClr = parseAndValidateColor(sc.next());
						// => valid clr
						// non PK based
						for (Vehicle v : showroom)
							if (v.getVehicleColor() == chosenClr)
								System.out.println("Removed " + showroom.remove(v));
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // sc.clsoe() : JVM

	}

}

========================================================================================


package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iacsd.Customer;
import com.iacsd.ServicePlan;

import custom_exceptions.CustomerHandlingException;

import static utils.CustomerValidationRules.*;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// create empty AL to hold customer refs
			List<Customer> customerList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all " + "4. Change Password 5.Unsubscribe customer");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:// customer reg.
						System.out.println(
								"Enter customer details :  firstName,  lastName,  email,  password,  regAmount,  dob service Plan");
						Customer validCustomer = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(validCustomer);
						System.out.println("customer registered....");

						break;
					case 2: // sign in
						System.out.println("Enter email n password");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						System.out.println(validCustomer);
						break;

					case 4:  //change password
						System.out.println("Enter email , old pwd , new pwd");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						//=> valid login
						validCustomer.setPassword(sc.next());
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// read off pending token from the scanner till EOL (end of line)
					sc.nextLine();
				}
			}
		}

	}

}
