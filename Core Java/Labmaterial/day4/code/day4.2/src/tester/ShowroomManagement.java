package tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;
import static utils.VehicleValidationRules.validateAllInputs;

import custom_exceptions.VehicleHandlingException;

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
					case 1: // add
						if (counter < showroom.length) {
							System.out.println(
									"Enter vehicle details : chasisNo,  vehicleColor,  base Price,  manufactureDate,  company");
							Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									sc.next(), showroom);
							showroom[counter++] = vehicle;
							System.out.println("new vehicle added to the showroom!");
						} else
							throw new VehicleHandlingException("Showroom Full!!!!!!!!!!!");

						break;
					case 2: 
						System.out.println("Showroom details ");
						for(Vehicle v : showroom)
							if(v != null)
								System.out.println(v);//v.toString
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();// name , mesg , location
				}
			}
		} //sc.close()

	}

}
