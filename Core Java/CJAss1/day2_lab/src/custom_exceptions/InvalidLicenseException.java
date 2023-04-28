package custom_exceptions;

@SuppressWarnings("serial")
public class InvalidLicenseException extends Exception {
	public InvalidLicenseException(String mesg) {
		super(mesg);
	}
}
