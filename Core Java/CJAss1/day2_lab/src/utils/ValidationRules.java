package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import custom_exceptions.InvalidLicenseException;
import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static SimpleDateFormat sdf ;
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}

//add a static method to validate speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow!!!!!!!!!!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast , FATAL !!!!");
		System.out.println("speed within range....");
	}

	// add a static method for parsing n validating exp date
	public static Date validateLicense(String expDate) throws ParseException, 
	InvalidLicenseException {
		// parsing
		// SDF
		
		Date licenseExpDate = sdf.parse(expDate);
		// => parsing successful --> proceed to validation
		// curnt date
		Date today = new Date();
		if (licenseExpDate.after(today))
			return licenseExpDate;
		// => license expired
		throw new InvalidLicenseException("Licence expired , Pls renew ASAP!!!!!!");
	}
}



