package com.code;

public class Date {
	private int day, month, year;

	public Date() {
	 
		System.out.println("---dafult---");
		day = 1;
		month = 6;
		year = 1960;

	}

	public Date(int year) {
		// call default constr from parameter constr
		// constrctor chaining:calling constr of same class from another constr

	 	this();// calling default constr
		System.out.println("---parameter(year)---");
		this.year = year;

	}

	public Date(int month, int year) {
		this();
		System.out.println("---parameter(m,y)----");
		this.month = month;
		this.year = year;

	}

	public String toString() {
		return "Date:" + day + "/" + month + "/" + year;
	}

}
