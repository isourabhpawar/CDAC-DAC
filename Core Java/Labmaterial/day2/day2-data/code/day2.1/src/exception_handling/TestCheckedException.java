package exception_handling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestCheckedException {

	public static void main(String[] args) {
		try {
			// prompt DoB to user (scanner) n parse string --> date n print it
			Scanner sc = new Scanner(System.in);
			// 1. create instance of java.text.SimpleDateFormat(String pattern)
			// y : year , M : month . d : date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Enter DoB : yr-mon-day");
			Date dob = sdf.parse(sc.next());
			System.out.println("Dob " + dob);
			sc.close();
			System.out.println("end of try...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd....");

	}

}
