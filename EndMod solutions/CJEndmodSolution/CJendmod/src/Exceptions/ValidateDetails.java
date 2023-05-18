package Exceptions;

import java.time.LocalDate;

import com.app.stud.Qualif;

public class ValidateDetails {
	
	
	
	public static LocalDate validateDob(LocalDate sdob) throws StudentDetailException {
		
		//custom exception validating dob
		if(sdob.isBefore(LocalDate.of(2000, 1, 1)))
			throw new StudentDetailException("Student is before 1/1/2000,not allowed");
		return sdob;
		
	}
	
	public static Qualif validQualif(String qualif) throws Exception {
	    try {
      	//validating qualification    	
	    
		 return Qualif.valueOf(qualif.toUpperCase());
	    }
	    catch(Exception e) {
	    	throw new StudentDetailException("Invalid Qualification ");
	    }
	}

}
