package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter showroom size");
			Vehicle[] showroom = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			// init phase over : called exactly once !
			// clnt servicing phase
			while (!exit) {
				System.out.println("1. Add New Vehicle  2. Display  0. Exit");
				System.out.println("Choose an Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						break;
					case 2:
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();// name , mesg , location
				}
			}
		}

	}

}
