package method_overriding;

public class Tester {

	public static void main(String[] args) {
		A ref=new B();//up casting
		ref.show();//show() : B's instance

	}

}
