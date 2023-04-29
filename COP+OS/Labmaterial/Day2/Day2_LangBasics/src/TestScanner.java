import java.util.Scanner;


public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----Testing Scanner Demo-----");
		//to accept i/p from user using keyboard
		//Scanner class is used
		//Scanner class  is define inside package java.util
		//import java.util.Scanner;
		
		Scanner  sc=new Scanner(System.in);
		int no1,no2;
		System.out.println("Enter No1 No2");
		no1=sc.nextInt();//read int values from user
		no2=sc.nextInt();//read next int value
		
		System.out.println("Name City");
		String name=sc.next();//reading String from user
		String city=sc.next();//read string from user
		
		System.out.println("Data-----");
		System.out.println(no1+"   " +no2);
		
		System.out.println(name+"   "+city);
		System.out.println("Enter Per:");
		
		double d;
		if(sc.hasNextDouble())
		{    d=sc.nextDouble();
			System.out.println("double"+d);
		}
		else
			 System.out.println("plz enter double value");
		
		
		
		
		
		
		
		
		
		

	}

}
