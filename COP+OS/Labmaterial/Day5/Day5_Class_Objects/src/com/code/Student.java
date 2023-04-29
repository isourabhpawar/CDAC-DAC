package com.code;

public class Student {
	
	private int rollno;//instance variable:copy get created per object
	
    private String name,city;//instnace
    private int age;//copy get created per object
    private double percentange;//copy get created per object
    private   static  String instituteName;//single copy :shared by all objects
    
    //static block:used for iniitialisation of static variable
    //When Static blcok get Called:as soon as class get loaded by class loader
    //non static or instance  variables or  data members are not accessible inside static block or static metohds
    static
    {
    	
    	System.out.println("---static block 1-----");
    	instituteName="IACSD";
    }
    static
    {
    	System.out.println("---static block 2-----");
    	 
    }
    static
    {
    	System.out.println("---static block 3-----");
    	 
    }
    
    //to access or to change static data members write static methods
    //HOw to call Sttaic Methods:Using  className.MethodName
    public static void displayInstituteName()
    {
    	System.out.println(instituteName);
    }
    
    public static void changeName()
    {
    	instituteName="New IACSD";
    }
    
	public Student(int rollno, String name, String city, int age, double percentange) {
		 System.out.println("---constr Student-----");
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.age = age;
		this.percentange = percentange;
	}
    
    public void displayStudent()//instance method
    {
    	
    System.out.println(rollno+"   "+name+"   "+city+"   "+percentange+"   "+instituteName);	
     	
    	
    	
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
