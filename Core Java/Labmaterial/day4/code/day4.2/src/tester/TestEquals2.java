package tester;

import java.time.LocalDate;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestEquals2 {

	public static void main(String[] args) {
		String s="hello";
		// String chasisNo, Color vehicleColor, double netPrice, LocalDate
		// manufactureDate, String company) {
		Object v1 = new Vehicle("abc-12345", Color.BLACK, 500000, LocalDate.parse("2023-02-03"), "Honda");
		Object v2 = new Vehicle("abc-12345", Color.RED, 1500000, LocalDate.parse("2023-02-03"), "Honda");
		
		System.out.println(v1.equals(v2));// t : replace ref equality by Unique ID (PK) equality : ch no
		System.out.println(v1.equals(s));//f no javac err : up casting
	}

}
