package tester;

import static utils.CMSUtils.populateList;
import static utils.CustomerValidationRules.customerLogin;
import static utils.CustomerValidationRules.validateAllInputs;

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
								sc.nextDouble(), sc.next(), sc.next(), customerList);
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
