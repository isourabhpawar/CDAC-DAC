package exception_handling;

import java.util.Scanner;
import static utils.ValidationRules.*;

public class TestCustomException {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			//validate exp date
			System.out.println("Enter license exp date : dd-MM-yyyy");
			System.out.println("Your license is expiring on "+validateLicense(sc.next()));
			System.out.println("end of try....");
			
		} catch (Exception e) {
		//	e.printStackTrace();//nm mesg location
			System.out.println(e.getMessage());
		}
		System.out.println("main over.....");

	}

}
