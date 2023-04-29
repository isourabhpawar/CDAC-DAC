package pkg2;

public class Date {

	   // description:data Members ,fields
		// private access specifer:accessible inside class only
		private int day, month, year;//instance variable:associated with object
		
		//to assign default value to data memerbs
		//use constructor
		//What Constructor:Special method why bcoz constr name is same as class name
		//constr will never have return typr not even void
		//if constr not accepting parameters it is called default constr or  parameterless constr or 
		//no arguments constr
		
		public  Date() {
		System.out.println("---inside Date class Default constr-----");	
		
		day=1;
		month=6;
		year=1960;
		}
		//parameterized constr;:constr accepting parametrs
		public  Date(int day,int month,int year)
		{
			System.out.println("-----inside parameterised constr-----");
			System.out.println("invoked by object at memory location:"+this.hashCode());
			this.day=day;
			this.month=month;
			this.year=year;
			
		}
		
		
		
		
		
		// to access private data outside class
		// create public functions
		// to assign day month year create function
		// accept day month yeear from usre
		public void acceptDate(int d, int m, int y) {
	 
			day = d;// 20
			month = m;// 3
			year = y;// 1999

		}

		public void printDate() {
			System.out.println(this.hashCode());
			System.out.println("Date:" + this.day + "/" + this.month + "/" + this.year);
		}
	
}
