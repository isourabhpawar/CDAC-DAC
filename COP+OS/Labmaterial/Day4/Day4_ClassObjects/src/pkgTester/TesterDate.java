package pkgTester;

import pkg2.Date;

public class TesterDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d;// d is ref variable

		// constr will get invoke implicilty as soon as new keyword get execute

		d = new Date();// this will invoke default constr
//		
		d.printDate();
		
		//accept DOB of Student
		//9 4 1999
		System.out.println("--------------------");
		Date dob;
		dob=new Date(9, 4, 1999);//parameterised constr
		dob.printDate();//
		
		Date d2=new Date(8, 5, 1982); 
	   d2.printDate();
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
	}

}
