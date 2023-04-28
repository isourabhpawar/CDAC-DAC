package excphand;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidationRules {

	public static final int MAXSPD;
	public static final int MINSPD;
	
	public static SimpleDateFormat sdf;
	static {
		MAXSPD = 80;
		MINSPD = 40;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public static void chkspeed(int spd) throws Speedoutofrange {

		if (spd > MAXSPD) {
			throw new Speedoutofrange("Too fast, Danger!!");

		}

		if (spd < MINSPD) {
			throw new Speedoutofrange("Too slow, Traffic Behind!!");
		}

		System.out.println("Continue Safe Driving");

	}

	public static Date verifylicense(String date) throws ParseException, InvalidLicense {

		Date cd = new Date();

		if (sdf.parse(date).after(cd)) {
			return sdf.parse(date);
		} else {
			throw new InvalidLicense("Please renew your License!!");
		}

	}

}
