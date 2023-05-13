package p3;

public interface Formula {
	double calculate(double a);// public n abstract: impl added by javac

	// public : impl added by javac
	default double sqrt(double a, double b) {
		System.out.println("in i/f def method");
		return Math.sqrt(a + b);
	}
	//can add static methods in the i/f
	//javac : public 
	static void show()
	{
		System.out.println("in i/f static method");
	}
}