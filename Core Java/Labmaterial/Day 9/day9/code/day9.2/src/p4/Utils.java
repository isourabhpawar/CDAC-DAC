package p4;

public interface Utils {
//add a static method , to invoke anyOperation on 2 double operands n ret result
	// higher order function/method : func or a method which either accepts a
	// behavior or rets the behavior to the caller
	static double invokeAnyOperation(double a, double b, Computable ref) {
		return ref.anyOperation(a, b);
	}
}
