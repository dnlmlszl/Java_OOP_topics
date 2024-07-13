package triangle;

public class Triangle {

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double calculatePerimeter() {
		
		if (isValidTriangle()) {
			return sideA + sideB + sideC;
		} else {
			System.out.println("Invalid triangle data, unable to calculate triangle perimeter!");
			return 0.0;
		}
	}
	
	private boolean isValidTriangle() {
		
		boolean sides = sideA > 0 && sideB > 0 && sideC > 0;
		boolean sideCheck = (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideB > sideC) && (sideC + sideA > sideB);
		
		return sides && sideCheck; 
	}
	
	public void printPerimeter() {
		
		double perimeter = calculatePerimeter();
			
		if (perimeter > 0) {
	        System.out.println("Triangle perimeter: " + perimeter);
	    }
	}
}
