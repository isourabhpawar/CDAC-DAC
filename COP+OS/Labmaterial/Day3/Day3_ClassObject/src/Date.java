
public class Date {

	// description:data Members ,fields
	// private access specifer:accessible inside class only
	private int day, month, year;

	// to access private data outside class
	// create public functions
	// to assign day month year create function
	// accept day month yeear from usre
	public void acceptDate(int d, int m, int y) {

		//scanner
		day = d;// 20
		month = m;// 3
		year = y;// 1999

	}

	public void printDate() {
		System.out.println("Date:" + day + "/" + month + "/" + year);
	}

}
