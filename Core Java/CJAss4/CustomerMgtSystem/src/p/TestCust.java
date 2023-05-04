package p;

import static p.CMSUtils.populateList;
import static p.CustomerValidationRules.validateallinputs;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestCust {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//			int ch = 1;

			System.out.println("Welcome to  Management System");
//			int index = 0;
			boolean exit = false;
			List<Customer> cust = populateList();
//		
			ListIterator<Customer> citr=cust.listIterator();
			while (!exit) {
				System.out.println("\nEnter the option from below: \n1.Signup as customer\n2."
						+ "Signin as customer\n3.Update Password\n4.Unsubscribe"
						+ "\n5.show all customers\n6.Sort on basis of email"
						+ "\n7.sort based on dob and registration amount"
						+ "\n8.Pay subscription\n9.delete the customer details ,who have not paid the"
						+ "\n subscription (reg amount) for more than last 3  months\n0.To exit");
				try {

					switch (sc.nextInt()) {
					case 1:// Signup

						System.out.println("\nEnter the name,emailid,password,registamt,dob,plan");

						Customer validcustomer = validateallinputs(sc.next(), sc.next(), sc.next(), sc.nextInt(),
								sc.next(), sc.next(), cust);
						cust.add(validcustomer);
						System.out.println("Customer Added");

						break;
					case 2:// sign in
						System.out.println("\nEnter the id");
						String id = sc.next();
						System.out.println("\nEnter the password");
						String pass = sc.next();

						int index1 = cust.indexOf(new Customer(id));
						if (index1 >= 0)
							if (cust.get(index1).getPassword().equals(pass))
								System.out.println("Logged in successfully");

						break;
					case 3:// update pass

						System.out.println("\nEnter the emailid");
						String id1 = sc.next();
						System.out.println("\nEnter the old password");
						String pass1 = sc.next();

						int index2 = cust.indexOf(new Customer(id1));
						if (index2 >= 0) {
							if (cust.get(index2).getPassword().equals(pass1)) {
								cust.get(index2).setPassword(pass1);
								System.out.println("\nPassword changed successfully");
							}
						} else
							System.out.println("\nUser Doesnot Exists");
						break;
						
						
						
						
					case 4://unsubscribe
						
						System.out.println("\nEnter the emailid");
						String id2 = sc.next();
						System.out.println("\nEnter the password");
						String pass2 = sc.next();
						
						int index3= cust.indexOf(new Customer(id2));
						if (index3 >= 0) {
							if (cust.get(index3).getPassword().equals(pass2)) {
								cust.remove(index3);
								System.out.println("\nUser unsubscribed successfully");
							}
						} else
							System.out.println("\nUser Doesnot Exists");
						break;
					case 5://show all customers
						for(Customer c:cust) {
							System.out.println(c);
						}
//						System.out.println(cust);
						break;
						
					case 6://sort on email
						Collections.sort(cust);
						break;
						
					case 7://Sort as per dob and regstamt
						
						Collections.sort(cust, 
								
								new Comparator<Customer> () {

									@Override
									public int compare(Customer o1, Customer o2) {
										int retnval=o1.getDob().compareTo(o2.getDob());
										if(retnval==0) { 
											return ((Integer)(o1.getSrvcplan().getCharge()))
													.compareTo((Integer)(o2.getSrvcplan().getCharge())); }
										return retnval;
										//boxing in Wrapper
									}
							
						}
								
								);
						System.out.println("Sorted on dob and plan charge");
						break;
						
					case 8://update subscrip renewal date
						System.out.println("Enter the emailid");
						String emailid=sc.next();
						int index4=cust.indexOf(new Customer(emailid));
						if(index4>-1) {cust.get(index4).setLastSubscriptionPaidDate(LocalDate.now());
						System.out.println("Successfully subscribed");}
						else {System.out.println("Invalid Email");}
//						while(citr.hasNext())
//							if(citr.next().equals(emailid))
						break;
								
					case 9:
						System.out.println("delete the customer details ,who have not paid the subscription"
								+ "\n(reg amount) for more than last 3  months");
					
						
					break;
						
						
						
					
					case 0:
						exit=true;
						break;
						
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
