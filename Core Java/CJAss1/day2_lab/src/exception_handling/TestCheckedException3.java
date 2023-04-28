package exception_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCheckedException3 {

	public static void main(String[] args) {
		try {

			// prompt DoB to user (scanner) n parse string --> date n print it
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter DoB : dd/MM/yyyy");
			// invoke method : parseDob
			System.out.println("Dob :"+parseDob(sc.next()));
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

	// write a method to parse string --date
	private static Date parseDob(String dob) throws ParseException {
		// 1. SDF
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(dob);
	}

}
