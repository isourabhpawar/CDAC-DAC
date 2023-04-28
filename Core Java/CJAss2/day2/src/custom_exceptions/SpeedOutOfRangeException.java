package custom_exceptions;

@SuppressWarnings("serial") // => compile time annotation , to tell javac to ignore serialization related
							// warning
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String errMesg) {
		super(errMesg);
	}
}
