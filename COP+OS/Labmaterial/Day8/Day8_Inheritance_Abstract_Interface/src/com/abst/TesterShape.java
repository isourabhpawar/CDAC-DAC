package com.abst;

public class TesterShape {

	public static void displayShape(Shape s)
	{
		s.area();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s;
		Circle c=new Circle();
		c.area();
		
		Rectangle rect=new Rectangle();
		rect.area();
		
		Square sq=new Square();
		sq.area();
		 displayShape(c);
		 displayShape(sq);
		 displayShape(rect);
		
		
	}

}
