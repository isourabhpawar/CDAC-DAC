package p4;

import static p4.Utils.invokeAnyOperation;

public class Test1 {

	public static void main(String[] args) {
		//imperative style of prog
		// display addition of 2 numbers
		System.out.println(invokeAnyOperation(10, 20, new Computable() {

			@Override
			public double anyOperation(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1 + d2;
			}
		}));
		// display subtraction of 2 numbers
		System.out.println(invokeAnyOperation(10, 20, new Computable() {

			@Override
			public double anyOperation(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1 - d2;
			}
		}));
		
		// replace above by concise ano func : lambda expr
		//declarative style of prog (Functional Prog)
		System.out.println(invokeAnyOperation(10, 20, (a, b) -> a + b));
		//multiply 2 nos using lambda expr
		System.out.println(invokeAnyOperation(10, 20,(d1,d2)-> d1*d2));

	}

}
