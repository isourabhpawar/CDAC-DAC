package exception_handling;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		//try-with-resources
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter age");
			System.out.println("Age "+sc.nextInt());
			System.out.println("end of try-with-res");
		}//sc.close() : JVM calls auto.
		catch (Exception e) {
			System.out.println(e);//e.toString() --prints name + err mesg
		}
		System.out.println("main over....");
		
		

	}

}
