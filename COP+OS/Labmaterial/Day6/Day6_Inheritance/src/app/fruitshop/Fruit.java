package app.fruitshop;

public class Fruit {

	private String color;
	private double weight;

	
	public Fruit() {
		System.out.println("---fruit constr----");
		color = "nothing";
		weight = 0.500;

	}

	public void displayDetails() {
		System.out.println("Fruit Details:" + color + "   " + weight);
	}

	public void taste() {
		System.out.println("No Taste as such");
	}
}
