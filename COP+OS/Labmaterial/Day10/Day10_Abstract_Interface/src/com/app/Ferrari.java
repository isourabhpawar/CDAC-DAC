package com.app;

public class Ferrari extends Car {

	private int nos;
	
	
	public Ferrari(int modelno,String color,int nos) {
		super(modelno,color);
		System.out.println("Para Ferrari ");
		this.nos = nos;
	}

public void startNOS()
{
	System.out.println("Ferrari NOS started");
}
	@Override
	public void speed() {
		System.out.println("Ferrari Speed=360km/hr");
	}

}
