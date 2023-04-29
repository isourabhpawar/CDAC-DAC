import java.util.Scanner;

public class TesterDate {

	public static void main(String[] args) {
		System.out.println("Testing Date Class Here");
		// Access Date Class
		// HOw?Create Object of Date

		Date obj;
		obj = new Date();
		obj.printDate();//0 0 0
		obj.acceptDate(20, 3, 1999);
		obj.printDate();//20 3 1999
		//obj.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Month Year");
		int d=sc.nextInt();//day 10 
		int m=sc.nextInt();//month 3 
		int y=sc.nextInt();//year 2001
		
		//second DOB 
		//create one more object of Date
		Date dob1;
		dob1=new Date();
		dob1.printDate();//0 0 0
		dob1.acceptDate(d, m, y);
		dob1.printDate();
		
		//
		Date dob2=new  Date();
		System.out.println("Enter Day Month Year");
		  d=sc.nextInt();//day
		  m=sc.nextInt();//month
		  y=sc.nextInt();//year
		dob2.printDate();//0 0 0 
		dob2.acceptDate(d, m, y);
		dob2.printDate();//
		 
		
		
		
		
		
		
		
		
	}

}
