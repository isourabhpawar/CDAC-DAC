package app.code;

public class TesterParentA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create object of ParentA
		ParentA p1=new ParentA();
		p1.displayA();//this is method from ParentA
		System.out.println(p1.hashCode());
		p1.function1();
		 
		
		ChildA child=new ChildA();
		child.MethodChildA();
	 child.displayA();
	 child.function1();
		
	}

}
