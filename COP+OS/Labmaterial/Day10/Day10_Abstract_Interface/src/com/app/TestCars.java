package com.app;

public class TestCars {

	
	public static    void startRace(Car c)
	{
		c.speed();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c;
		//c=new Car();//error
		
		BMW bmw=new BMW();
		bmw.speed();
		System.out.println(bmw.getCarDetails());
		 
		 startRace(bmw);//startRace(Car c)
		
		BMW b=new BMW(0072, "Black", 2);
		b.speed();
		b.bmwFunction();
		System.out.println(b.getCarDetails());
		
		
		Ferrari f=new Ferrari(3404, "Red",4);
		f.speed();
		f.startNOS();
		startRace(f);//startRace(Car c)//upcasting
	}

}
