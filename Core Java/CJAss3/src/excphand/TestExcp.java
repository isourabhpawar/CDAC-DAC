package excphand;

import java.text.ParseException;
import java.util.Scanner;

public class TestExcp {

	public static void main(String[] args)  {
		try(Scanner sc=new Scanner (System.in)){
			
			System.out.println("Enter the Speed");
			
			ValidationRules.chkspeed(sc.nextInt());
			
			System.out.println("Enter expiry of license in (dd-mm-yyyy)");
			
			System.out.println(ValidationRules.verifylicense(sc.next())+" is your expiriy.");
			
			
			
		}
		
		catch(Speedoutofrange s) {
			System.out.println(s.getMessage());
			
		}catch(InvalidLicense i) {
			System.out.println(i.getMessage());
		}
		catch(ParseException p) {
			System.out.println("Enter date in specidfied format.");
		}

	}

}
