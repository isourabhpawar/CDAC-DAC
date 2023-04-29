import java.util.Scanner;

public class TesterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		System.out.println(a);
		String str1="iacsd";
		String str2="iacsd";
		
		System.out.println(str1.hashCode()+"    "+str2.hashCode());
		if(str1==str2)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		if(str1.equals("iacsd"))
			System.out.println("you enter IACSD");
		
		
	System.out.println("Enter Id First  add per ");
	Scanner sc=new Scanner(System.in);
	
	int i=sc.nextInt();
	sc.nextLine();
	String name=sc.nextLine();
	String ad=sc.nextLine();
	double per=sc.nextDouble();
	
	System.out.println(i+"    "+name +"   "+ad +"    "+per);
	 
	
	
		
		
		
		
	}

}
