package com.app;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Shape s=new Shape();//Error :can not instatiate type Shape: why-abstract class
	
		Shape s;
		
		Rectangle rect;
		rect=new  Rectangle();//Object----->Shape---->Rectangle
		//area is abstract method in shape and implemented in Rectangle
		rect.area();//rectangle class method
		//display is non abstract method in shape
		rect.display();//inherited method from shape class
		
		//impMethod is final method in shape class
		rect.impMethod();//final metod from shape 
		
		Shape.show();//static method from Shape class
		
		
		Shape.show();
		
		
		
		
		
	
	
	}

}
