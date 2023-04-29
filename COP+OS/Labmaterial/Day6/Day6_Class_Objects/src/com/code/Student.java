package com.code;

public class Student {
	private int rollno;
	private String name,city;
	private int m1,m2,m3,m4,m5;
	private int total;
	private String grade;
	private static int idCounter;
	
	static {
		System.out.println("---static---");
		idCounter=200;
		
	}

	public Student(String name, String city, int m1, int m2, int m3, int m4, int m5) {
		
		idCounter++;
		this.rollno=idCounter;
		this.name = name;
		this.city = city;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}
	private void calTotal()//helper method
	{
		total=m1+m2+m3+m4+m5;
	}
	//cal Percentage
	private void calGrade()//helper method
	{
		if(total>80)
			grade="A+";
		else
			grade="A";
		System.out.println("-------Grade-----"+grade);
	}
	
	public void display()
	{//
		//
		calTotal();//call helper methods in public 
		calGrade();
		
	System.out.println(rollno+"   "+name+"   "+total +"    "+grade);	
		
	}
	
	//hiding Object Class toString Method in student class
	//Overriding
	public String toString()
	{	calTotal();//call helper methods in public 
	   calGrade();
		return "Student:"+rollno+"   "+name+"   "+total +"    "+grade;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
