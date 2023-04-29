package com.tester;

public class Date {

	private int day, month, year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// d1.equals(d2);
	@Override
	public boolean equals(Object obj) {

		// convert obj into Date class
		// DownCast
		if(obj instanceof Date)
		{
		Date d = (Date) obj;//

		if (this.day == d.day && this.month == d.month && this.year == d.year)
			return true;
		else
			return false;
		}else
			
		return false;

	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
