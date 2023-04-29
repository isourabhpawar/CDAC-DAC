package method_overriding2;

public class Tester {

	public static void main(String[] args) {
		A ref=new B();//up casting
		ref.show();
		A.show();// since method binding is resolved by the type of ref : it's NOT run time poly.!!!!!
		B.show();
	}

}
