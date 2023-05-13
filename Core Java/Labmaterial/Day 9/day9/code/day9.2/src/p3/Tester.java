package p3;

public class Tester {

	public static void main(String[] args) {
		Formula[] formulae= {new MyFormula(),new AnotherFormula()};
		for(Formula f : formulae)
		{
			System.out.println(f.calculate(10));
			System.out.println(f.sqrt(20, 5));
			
		}
		//how to invoke i/f's static method?
		Formula.show();
		//how to invoke cls's static method?
		MyFormula.show();
	}

}
