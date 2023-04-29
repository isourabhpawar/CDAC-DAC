
public class TesterMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		// to access method from class
		// create an object of that class

		MyMath obj = new MyMath();
		obj.add1(a, b);

		int x = 35;
		double p = 45.67;

		obj.add2(x, p);

		// make addition 2 double

		double d1 = 90.44, d2 = 44.23;
		obj.add3(d1, d2);

		obj.addition(12.34, 45.7);
		obj.addition(12.45, 10);
		obj.addition(12, 46.78);
		obj.addition(34, 77);
		obj.addition(1, 1, 1, 1);

		obj.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10);
		obj.sum(1, 26, 7, 8, 9, 0, 12);
		obj.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 5, 6, 7, 8);
		int m=0;
		
		obj.sum(m );

		
		
		obj.display("Ram");
		
		obj.display("Ramesh","c","C++");
		
		obj.display("Ritesh", "c","cpp","java","webProg","recat","angular","DS","DB","scripting","SE");
		
		
		
		
		
	}

}
