2: Solve assignment (to understand abstraction)
1. Create abstract class Shape --state :  x,y 
Abstract Method --public double area();
public String toString() : to ret x & y

Why will area() be abstract in Shape class ?????????

2. Circle -- x,y,radius
Concrete overriding Method --public double area() : ret area of circle
public String toString() : ret x, y & radius

3. Rectangle -- x,y,w,h
Concrete overriding Method --public double area() : ret area of rectangle
public String toString() : ret x, y , width & height

4. Square-- x,y,side
Concrete overriding Method --public double area() : ret area of square
public String toString() : ret x, y , side

5. Create a ShapeFactory class 
Add a static method(generateShape)  to return randomly generated shape.
Hint : random no generator

6. Create a Tester . Invoke ShapeFactory's generateShape() method , in a for-loop (5 times)
to display details & area of each shape


//Class File

package Area;
import Area.Shape;
import Area.Circle;
import Area.Rectangle;
import Area.Square;

import java.util.Random;

public class ShapeFactory {

	public static Shape generateShape() {

		double x =  (Math.random() * 100);
		double y =  (Math.random() * 100);
		double rand = Math.random() * 100;
		double ht = Math.random() * 100;
		double wid = Math.random() * 100;
		if (rand < 33) {
			double radius = Math.random() * 100;
		
			return new Circle(x, y, radius);
		} else if (rand < 66) {
			double size=Math.random() * 100;
		
			return new Square(x, y, size);

		} else {
		
			return new Rectangle(x, y, ht, wid); 
		}

	}

}

//Class File

package Area;

public abstract class Shape {
	
	protected double x,y;
	
	
	public Shape() {}

	public Shape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract double  area();

	@Override
	public String toString() {
		return x+" "+y;
		
	}
}


//Class File

package Area;

public class Circle extends Shape{
	private double radius;
	double circlearea=0;

	public Circle(double x,double y,double radius) {
		super(x,y);
		this.radius = radius;
	}

	
	public double area() {
		double circlearea=Math.PI*radius*radius;
		return circlearea;
	}
	
	public String toString() {
		return super.toString()+ " radius of cirle is "+radius;
		
	}
}


//Class File

package Area;

public class Rectangle extends Shape{
	
	double height=0;
	double width=0;
	double rectarea=0;
	public Rectangle(double x,double y, double height, double width) {
		super(x,y);
		this.height = height;
		this.width = width;
	}
	
	
	public double area() {
		rectarea=height*width;
		return rectarea;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" Rectangle [height=" + height + ", width=" + width + "]";
	}
}

//Class File

package Area;

public class Square extends Shape{
	private double side;
	private double sqarea=0;

	public Square(double x,double y,double side) {
		super(x,y);
		this.side = side;
	}
    @Override
	public double area() {
		sqarea=side*side;
		return sqarea;
	}
    
	@Override
	public String toString() {
		return super.toString()+" Square [side=" + side + "]";
	}
}

//Tester

package Area;

import Area.Shape;
import Area.ShapeFactory;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Shape shape = ShapeFactory.generateShape();
            System.out.println(shape.toString() + ", area: " + shape.area());
        }
    }
}





—-------------------------------------------------------------
7. Objective

:Define an interface and implement it in any class wherever it is required.
Pre-condition
: Employee, Date and Shape class should be created.
Problem Statement

7.1:Define an interface Printable with a method print(). Implement this
interface in Employee, Shape and Date class. 

//Class File


package com.Interface;
 
public interface Iprintable {
        	//all data members are by default public final and static
        	
        	//int abc=100;
 
        	//methods are public abstract
        	default void print()   //no need to write public abstract void print();
        	{System.out.println("Inside Interface class");}
        	
}

//Class File 
package com.Interface;
public class Date implements Iprintable
{
        	public void print() {
        	System.out.println("Print method in Date Class");
        	}
}

//Class File 
package com.Interface;
 
public class Emp implements Iprintable
{
        	@Override
        	public void print() {
                    	System.out.println("Print method in Manager Class");
        	}
}

//Class File

public class Shape implements Iprintable
{
        	public void print() {
                    	System.out.println("Inside Shape class");
        	}
}


 //Tester
package com.Interface;
 
public class TestInterference {
        	
        	public static void display(Iprintable p)
        	{
                    	p.print();
        	}
 
        	public static void main(String[] args)
        	{
                    	Date d = new Date();
                    	Emp e =new Emp();
                    	Shape s = new Shape();
                    	
                    	System.out.println("Print function by object creation");
                    	d.print();
                    	e.print();
                    	s.print();
                    	
                    	System.out.println("================");
                    	System.out.println("Declaring Static Display function above by Interface obj arg ");
                    	display(d);
                    	display(e);
                    	display(s);
        	}
 
}

