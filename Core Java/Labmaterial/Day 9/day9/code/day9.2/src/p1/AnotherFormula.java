package p1;

public class AnotherFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method : "+getClass());
		return a+a;
	}
	//can u override inherited def method ? YES

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overriding def method : "+getClass());
		return Math.sqrt(a-b);
	}
	

}
