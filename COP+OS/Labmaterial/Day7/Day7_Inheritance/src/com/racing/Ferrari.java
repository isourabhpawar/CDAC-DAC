package com.racing;

public class Ferrari extends Car {
	//
	private int nosQty;
public Ferrari()
{
	System.out.println("---ferrari default constr----");
	
}
public Ferrari(int modelno,String color,String fuelType,int nosQty)
{
	super(modelno,color,fuelType);
	System.out.println("---ferrari parameter constr----");
	this.nosQty=nosQty;
}
@Override
public void carDetails()
{
	super.carDetails();
	System.out.println("From Ferrari NOS:"+nosQty);
}
public void speed()
{
	System.out.println("----speed of Ferrari 250 km/hr-------");
	
	
}

@Override
public String toString()
{
	return super.toString()+"   "+nosQty;
}




public void startNos()
{
	System.out.println("Ferrari Specific Function");
}




















}
