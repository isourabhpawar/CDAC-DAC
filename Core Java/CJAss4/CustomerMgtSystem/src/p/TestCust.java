package p;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static p.CustomerValidationRules.validateallinputs;

public class TestCust {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//			int ch = 1;

			System.out.println("Welcome to  Management System");
//			int index = 0;
			boolean exit = false;
			List<Customer> cust = new ArrayList<>();

			while (!exit) {
				System.out.println("\nEnter the option from below: \n1.Signup as customer\n2."
						+ "Signin as customer\n3.Update Password\n4.Unsubscribe"
						+ "\n5.show all customers\n6.Sort on basis of email\n0.To exit");
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
						System.out.println(cust);
						break;
						
					case 6:
						Collections.sort(cust);
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
