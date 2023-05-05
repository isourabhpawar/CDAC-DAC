package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class VehicleValidationRules {
	// add a static method to invoke all validation rules
	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor, double basePrice,
			String manufactureDate, String company, List<Vehicle> vehicles) throws VehicleHandlingException {
		// invoke validation rules
		checkForDuplicate(chasisNo, vehicles);
		Color validColor = parseAndValidateColor(vehicleColor);
		double netPrice = basePrice + validColor.getColorCost();
		LocalDate validDate = parseAndValidateDate(manufactureDate);
		// => all valid i/ps --wrap these details in Vehicle class instance n ret the
		// ref to the caller
		return new Vehicle(chasisNo, validColor, netPrice, validDate, company);
	}

//add a static method to parse n validate color
	public static Color parseAndValidateColor(String clr) throws IllegalArgumentException {
		return Color.valueOf(clr.toUpperCase());
	}

	// add a static method to parse n validate manu. date
	public static LocalDate parseAndValidateDate(String date) throws DateTimeParseException, VehicleHandlingException {
		// parsing
		LocalDate d1 = LocalDate.parse(date);// def date pattern : yyyy-MM-dd
		// parsing successful ---proceed to validation : curnt year
		// create LocaDate instance : beginning of the year
		LocalDate beginYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		if (d1.isAfter(beginYear))
			return d1;
		throw new VehicleHandlingException("Vehicle manufacture date must be after 1st Jan of the curnt year");

	}

	// No dup vehicles should be added in the showroom :
	public static void checkForDuplicate(String newChasisNo, List<Vehicle> vehicles)
			throws VehicleHandlingException {
		// showroom : {v1("abc-12345"),v2("abc-12344"),v3("abc-12346"),null....null}
		// newChasisNo :abc12344
		Vehicle newVehicle = new Vehicle(newChasisNo);// invoking sing arg ctor : wrapping PK
		if (vehicles.contains(newVehicle))
			throw new VehicleHandlingException("Dup Chasis No!!!!!!!!!!!");
		System.out.println("no dup found!!!!");
	}

}
