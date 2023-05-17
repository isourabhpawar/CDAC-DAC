package Utils;

import java.time.LocalDate;

import Pkg.Color;
import Pkg.Vehicle;
import Pkg.VehicleHandlingException;

public class VehicleValidationRule {

	
	public static void checkForDupChasis(String newChasisNo , 
			Vehicle [] vehicles)throws VehicleHandlingException 
	{
		Vehicle newvehicles = new Vehicle(newChasisNo);
		for(Vehicle v : vehicles )
		if(v != null)
			if(v.equals(newChasisNo))
				throw new VehicleHandlingException("Duplicate ChasisNo Found");
		System.out.println("No Duplicate Found");
    }
	            // Color-Datatype
	public static Color parseAndValidateColor(String str) {//Color will written in String
		return Color.valueOf(str.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String date)
			throws VehicleHandlingException {
		//Real Parse Method
		LocalDate d1 = LocalDate.parse(date);//Parse=(yyyy/mm/d)
		LocalDate beginyear = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		if(d1.isAfter(beginyear))
		return d1;
		throw new VehicleHandlingException("Enter Date from current Year Only");
	}
	

}
