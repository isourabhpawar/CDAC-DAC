package com.code;

public class Student {

	private int rollno;
	private String name;
	private double percentage;
	public Student(int rollno, String name, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	//override toString method
	//same fun name and same signature and return type same
	
	@Override
	public String toString()
	{
		
		return rollno +"   "+name +"    "+percentage;
	}
	
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
