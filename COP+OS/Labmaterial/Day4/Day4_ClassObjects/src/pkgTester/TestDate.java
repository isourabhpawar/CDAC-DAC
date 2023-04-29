package pkgTester;

import pkg2.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1;
		d1=new Date(12, 3, 2009);//parameter constr
		System.out.println(d1.hashCode());
		d1.printDate();
		
		
 	Date d2=new Date(1, 1, 2020);
 		d2.printDate();
 		
 		
 		Date d3;
 		d3=d2;
 		d3.printDate();
 		
 		System.out.println("d2:"+d2.hashCode()+"   d3="+d3.hashCode());
 		d2=null;
 		d2.printDate();
		
	}

}
