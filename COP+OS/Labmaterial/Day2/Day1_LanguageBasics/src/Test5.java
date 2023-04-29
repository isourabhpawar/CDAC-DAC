import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rollno;

		String name, city;
		double per;
		boolean result;
		System.out.println("Enter RollNo Name City Percentage exStud IACSD(true/false)");
		rollno=sc.nextInt();
		name=sc.next();
		city=sc.next();
		per=sc.nextDouble();
		result=sc.nextBoolean();
		
	 
		System.out.println("------Details Of Student-----");
		
		System.out.println("RollNo="+rollno);
		System.out.println("Name="+name.toUpperCase());			
		System.out.println("city="+city);			
		System.out.println("per="+per);
		System.out.println("Student Of IACSD:"+result);
		
		
		//Lab Task:based on per calculate Grade and display
		
		
		System.out.println("Do You Want To continue (Y/N)");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		
		
		

	}

}
