
public class Tester {

	public static void display(IPrintable prn)
	{
		prn.print();
	}
	public static void main(String[] args) {

		Manager mgr = new Manager();
		Product prd = new Product();
		Date d = new Date();
		Student s = new Student();
		
		mgr.print();
		prd.print();
		d.print();
		s.print();
		System.out.println("-------------------------");
		display(mgr);//interface hold ref of class which implements interface
		display(prd);
		display(d);
		display(s);

	}

}
