import java.util.Scanner;

public class TestCustomerMenuDriven {
	public static void main(String[] args) {

		System.out.println(" 1:create customer 2: display details of cust 3:update email 4:update city 5:exit");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Customer cust = null;
		do {
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter CustId Name city email");
				cust = new Customer();
				cust.acceptDetails(sc.nextInt(), sc.next(), sc.next(), sc.next());
				// or
				//
//			      System.out.println("CustId  name city email");
//			 	 int  id=sc.nextInt();
//			 	 String nm=sc.next();//			 	 
//			 	 String ct=sc.next();
//			 	 String em=sc.next();
//			 	 cust2.acceptDetails(id, nm, ct, em);
				break;
			case 2:
				if (cust == null) {

					System.out.println("Customer Not Created Yet:case 1");
				} else {
					cust.display();
				}

				break;
			case 3:
				System.out.println("Enter New Email");
				String em = sc.next();
				cust.setEmail(em);
				System.out.println("Changed Email Id="+cust.getEmail());
				break;
			case 4:
				System.out.println("Enter New City:");
				cust.setCity(sc.next());
				System.out.println("Updated City:"+cust.getCity());
				break;
			case 5:
				break;
			default:
				break;
			}
		} while (choice != 5);

		System.out.println("----------------main------------");

	}
}
