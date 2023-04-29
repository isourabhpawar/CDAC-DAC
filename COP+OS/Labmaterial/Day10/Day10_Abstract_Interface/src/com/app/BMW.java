package com.app;

public class BMW  extends Car{

	private int airBags;
	public BMW()
	{
		System.out.println("BMW Default Constr");
		airBags=1;
	}
	public BMW(int modelno,String color,int airBags)
	{
		//bydefault super()
		super(modelno,color);
		System.out.println("--para BMW constr----");
		this.airBags=airBags;
	}
	@Override
	public void speed() {
		System.out.println("BMW speed=280 km/hr ");
		
	}
	//specific behaviour given by BMW class
	public void bmwFunction()
	{
		System.out.println("BMW Specific method");
	}
	
	
	//to get BMW specific details override getCarDetailsMethod
	@Override
	public BMW getCarDetails() {
		// TODO Auto-generated method stub
		return this;//
	}
	@Override
	public String toString() {
		return super.toString()+ "BMW [airBags=" + airBags + "]";
	}
	
	
	
	

}
