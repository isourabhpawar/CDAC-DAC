package tester;

import java.time.LocalDate;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestEquals {

	public static void main(String[] args) {
		// String chasisNo, Color vehicleColor, double netPrice, LocalDate
		// manufactureDate, String company) {
		Vehicle v1 = new Vehicle("abc-12345", Color.BLACK, 500000, LocalDate.parse("2023-02-03"), "Honda");
		Vehicle v2 = new Vehicle("abc-12345", Color.RED, 1500000, LocalDate.parse("2023-02-03"), "Honda");
		System.out.println(v1==v2);//f
		System.out.println(v1.equals(v2));//f : ref equality -- t : replace ref equality by Unique ID (PK) equality : ch no
		System.out.println(v1.hashCode()+" "+v2.hashCode());//different
	}

}
