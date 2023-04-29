package java8_date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.LocalDate.*;

public class Test3 {
//computing age of user in years
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter DoB : yyyy-MM-dd");
			LocalDate dob = parse(sc.next());
			int age=Period.between(dob, now()).getYears();
			System.out.println("Age "+age);

		} // sc.close();

	}

}
