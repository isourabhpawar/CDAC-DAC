package custom_exceptions;

@SuppressWarnings("serial")
public class VehicleHandlingException extends Exception {
	public VehicleHandlingException(String mesg) {
		super(mesg);
	}

}
