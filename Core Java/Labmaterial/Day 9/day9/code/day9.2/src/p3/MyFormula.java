package p3;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method : " + getClass());
		return a * a;
	}

//	@Override
	//can't override static methods , BUT can re-declare it
	static void show() {
		System.out.println("in class static method");
	}

}
