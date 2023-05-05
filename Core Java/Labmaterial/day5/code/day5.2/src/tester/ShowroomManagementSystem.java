package tester;

import static utils.ShowroomUtils.populateShowroom;
import static utils.VehicleValidationRules.parseAndValidateColor;
import static utils.VehicleValidationRules.parseAndValidateDate;
import static utils.VehicleValidationRules.validateAllInputs;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// create empty AL : to store vehicle refs
			List<Vehicle> showroom = populateShowroom();// size=0, init capa=1000
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options 1. Add a Vehicle 2. Display all "
						+ "3. Get specific vehicle details 4. Apply discount  "
						+ "5. Delete vehicle details  by ch no 6. Delete vehicles by color " + "0.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1: // add a new vehicle
						System.out.println(
								"Enter vehicle details : chasisNo,  vehicleColor,  netPrice,  manufactureDate(yr-mon-day),  company");
						Vehicle validVehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), showroom);
						showroom.add(validVehicle);
						System.out.println("vehicle added.....");
						break;
					case 2:
						System.out.println("Showroom contents : ");
						for (Vehicle v : showroom)
							System.out.println(v);
						break;
					case 3:
						System.out.println("Enter chasis no");
						// showroom : [v1,v2,v3...v10....]
						Vehicle vehicle = new Vehicle(sc.next());
						int index = showroom.indexOf(vehicle);// O(n)
						if (index == -1)
							throw new VehicleHandlingException("Invalid ch no , Vehicle not found!!!!!!!!!!!");
						// => vehicle found
						System.out.println(showroom.get(index));// toString : O(1)
						break;

					case 4:
						System.out.println("Enter date n discount amount");
						LocalDate date = parseAndValidateDate(sc.next());
						double discount = sc.nextDouble();
						// search by date (non PK based)
						for (Vehicle v : showroom)
							if (v.getManufactureDate().isBefore(date))
								v.setNetPrice(v.getNetPrice() - discount);
						System.out.println("discount applied....");
						break;
					case 5:
						System.out.println("Enter chasis no , to delete vehicle details");
						index = showroom.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							throw new VehicleHandlingException(
									"Invalid ch no , Vehicle not found, can't be removed !!!!!");
						System.out.println("Removed " + showroom.remove(index));
						break;

					case 6:
						System.out.println("Enter color");
						Color chosenClr = parseAndValidateColor(sc.next());
						// => valid clr
						// non PK based
						for (Vehicle v : showroom)
							if (v.getVehicleColor() == chosenClr)
								System.out.println("Removed " + showroom.remove(v));
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // sc.clsoe() : JVM

	}

}
