package p;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class TestCust {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int ch=1;
			
			System.out.println("Welcome to  Management System");
			int index=0;int flag=0;
			Customer[] cust=new Customer[10];
			
			
			do{
				System.out.println("\nEnter the option from below: \n1.Signup as customer\n2."
						+ "Signin as customer\n3.Update Password\n4.Unsubscribe\n5.show all customers\n0.To exit");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1://Signup
					
					
					System.out.println("\nEnter the name,emailid,password,dob(");
					String name=sc.next();
					String emailid=sc.next();
					for(Customer c:cust) {
							if(c!=null) {
							System.out.println(c.getEmail());
						    }
						}
					
						
						for(int j=0;j<index;j++) {
				
						if(cust[j]!=null && cust[j].getEmail().equals(emailid)) {
							System.out.println("Duplicate emailid, please reneter");
							emailid = sc.next();
						}
						}
						
								
					String pass=sc.next();
					WeakPasswordException.chkpass(pass);
					
					LocalDate dob=LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//					
					
							
					System.out.println("Select the plan:");
					
					for(Serviceplan s:Serviceplan.values()) {
						System.out.println(s+":Rs."+s.getCharge());
					}
					
					
					
					
					cust[index++]=new Customer(name,emailid,pass,dob,Serviceplan.valueOf((sc.next()).toUpperCase()));
					System.out.println("Customer Added.\nCustomer Id: "+cust[index-1].getCustid());
					
					
					
					break;
				case 2:
					break;
				case 3:
					
					System.out.println("enter old password");
					String oldpass=sc.next();
					for(Customer c: cust) {
						if(c.getPassword().equals(oldpass)) {
							System.out.println("enter new password");
							c.setPassword(WeakPasswordException.chkpass(sc.next()));
							System.out.println("Password Updated Successfully");
						}
					}
					
					
					break;
				case 4:
					break;
				case 5:
					System.out.println("List of all customers: ");
					for(Customer c:cust) {
						if(c!=null) {
						System.out.println(c);
					    }
					}
					
					break;
				}
				
				
				
				
			}while(ch!=0);
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	

}
