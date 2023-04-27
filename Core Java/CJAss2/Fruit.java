package com.app.fruits;

public  class Fruit {
	
	private String name;
	private String color;
	private double weight;
	private boolean freshness;
	public Fruit(String name, String color, double weight, boolean freshness) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.freshness = freshness;
	}
	
	public  String taste() {
		return "No Specific Taste";}
	
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight+ "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isFreshness() {
		return freshness;
	}
	public void setFreshness(boolean freshness) {
		this.freshness = freshness;
	}
	
	
	
	
	
	

}
