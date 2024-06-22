package TacePao.CircleCalculator;

public class Circle {
	private int radius;
	private final double pi = Math.PI;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.pow(this.radius, 2) * pi;
	}
	
	public double calculatePerimeter() {
		return this.radius * pi * 2;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return String.format("Circle with radius: %d, area: %.2f, perimeter: %.2f", radius, calculateArea(), calculatePerimeter());
	}

}
