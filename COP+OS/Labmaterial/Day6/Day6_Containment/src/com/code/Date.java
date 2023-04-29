package com.code;
//Date class extends Object class
//Object is Parent
//Date is Child
public class Date {
	private int day, month, year;

	public Date() {
	 
		System.out.println("---dafult---");
		day = 1;
		month = 6;
		year = 1960;

	}

	 

	public Date(int day,int month, int year) {
		 this.day=day;
		this.month = month;
		this.year = year;

	}

	//Date class hides Object class toString Method
	//method overriding
	//by keeping same fun name with same signature
	public String toString() {
		return "Date:" + day + "/" + month + "/" + year;
	}

}
