package Pkg;

public enum Color {

	WHITE(1000),BLUE(3000),RED(5000),GREEN(7000),BLACK(10000);
	
	private double colorCost;
	
	private Color (double colorcost) {
    this.colorCost=colorCost;
	}
	
	public double getColorCost() {
	return colorCost;
	}
	
	public String toString() {
		return name()+" "+colorCost;
	}
	
	
}
