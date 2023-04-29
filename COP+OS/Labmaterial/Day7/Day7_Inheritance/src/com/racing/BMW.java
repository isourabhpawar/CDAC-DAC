package com.racing;

public class BMW extends Car {
	// addition attribute in BMW
	private int noAirBags;

	public BMW() {
		System.out.println("--bmw default constr----");
	}

	public BMW(int modelno, String color, String fuelType, int noAirBags) {
		// by default super()

		// so for calling parameter constr of Car class
		// call sper(modelno,color,fuelType)

		super(modelno, color, fuelType);// must be very first statement
		this.noAirBags = noAirBags;
		System.out.println("------BMW parameter constr-----");

	}
	
 
	@Override
	public void carDetails()
	{
		super.carDetails();//calling parent class carDetails()
		System.out.println("From BMW NoOfAirBags="+noAirBags);
	}
	
	public void speed()
	{
		System.out.println("----speed of BMW 180 km/hr-------");
		
		
	}
	
	public String toString()
	{
		return  super.toString()+  "   "+noAirBags;
	}
	
	public void  comfirt()
	{
		System.out.println("BMW specific function ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
