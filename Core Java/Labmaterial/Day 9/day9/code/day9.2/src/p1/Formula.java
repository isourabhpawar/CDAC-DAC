package p1;

public interface Formula {
	double calculate(double a);// public n abstract: impl added by javac

	// public : impl added by javac
	default double sqrt(double a, double b) {
		System.out.println("in i/f def method");
		return Math.sqrt(a + b);
	}
}