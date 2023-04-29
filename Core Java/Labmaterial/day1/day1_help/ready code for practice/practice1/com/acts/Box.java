package com.acts;
public class Box {
//properties(non static data members=instance variables)
	private double width;
	private double depth;
	private double height;

	// add a parameterized constructor to init COMPLETE state of the Box
	public Box(double w, double d, double height) {
		width = w;
		depth = d;
		this.height = height;// RHS : local var , LHS : instance var.
	}

	// Behavior : functionality (methods)
	// Add a method : To return Box details in string form (dims of Box)
	public String getBoxDims() {
		return "Box Dims are " + this.width + " " + this.depth + " " + height;
		// NOTE : this keyword here is optional
	}

	// Add a method to return computed volume of the box.
	public double getComputedVolume() {
		return width * depth * this.height;
		// NOTE : this keyword here is optional (All instance method : non static
		// methods can access instance vars directly
	}
}
