package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;

import static utils.VehicleValidationRules.validateAllInputs;

public class ShowroomUtils {
//Add a static method to return populated list(sample hardcoded data) of vehicles
	public static List<Vehicle> populateShowroom() {
		try {
			ArrayList<Vehicle> vehicles = new ArrayList<>();
			vehicles.add(validateAllInputs("abc-1234", "red", 345678, "2023-02-14", "Honda", vehicles));
			vehicles.add(validateAllInputs("abc-1230", "white", 445678, "2023-03-14", "Honda", vehicles));
			vehicles.add(validateAllInputs("abc-1233", "white", 375678, "2023-02-18", "Honda", vehicles));
			vehicles.add(validateAllInputs("abc-1238", "red", 315678, "2023-03-01", "Maruti", vehicles));
			vehicles.add(validateAllInputs("abc-1239", "white", 395678, "2023-02-14", "Honda", vehicles));
			vehicles.add(validateAllInputs("abc-1231", "white", 345878, "2023-03-15", "Maruti", vehicles));
			vehicles.add(validateAllInputs("abc-1232", "red", 385678, "2023-03-25", "Honda", vehicles));
			vehicles.add(validateAllInputs("abc-1240", "black", 305678, "2023-02-14", "Maruti", vehicles));
			return vehicles;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
