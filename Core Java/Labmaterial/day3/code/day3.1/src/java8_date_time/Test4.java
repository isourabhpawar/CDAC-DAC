package java8_date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDate.*;

public class Test4 {
//printing product exp date
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter manufacture date : yyyy-MM-dd");
		LocalDate manufactureDate=parse(sc.next());
		System.out.println("Enter shelf life in days");
		LocalDate expDate=manufactureDate.plusDays(sc.nextLong());
		System.out.println("Product expires on "+expDate);
		System.out.println(manufactureDate);

		} // sc.close();

	}

}
