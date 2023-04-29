import java.util.Scanner;

public class TesterCutomer {

	public static void main(String[] args) {
	 System.out.println("----customer Registration application----");
	 Scanner sc=new Scanner(System.in);
	 
	 //create an object of Customer Class
	 
	 Customer cust1=new Customer();
	 cust1.display();
	 cust1.acceptDetails(10, "Ram", "Pune", "ram@gmail.com");
	 cust1.display();
	 
	 //to store details of 2nd customer
	 //create one more object of Customer
	 
	 Customer cust2=new Customer();
	 System.out.println("CustId  name city email");
	 int  id=sc.nextInt();
	 String nm=sc.next();//sham
	 
	 String ct=sc.next();
	 String em=sc.next();
	 cust2.acceptDetails(id, nm, ct, em);
	 cust2.display();
	 
	 System.out.println("------------------------------");
	 //
	 System.out.println(cust1.hashCode());
	 
	 System.out.println(cust2.hashCode());
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
