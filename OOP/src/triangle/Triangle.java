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
	
	
	
	public double getSideA() {
		return sideA;
	}



	public void setSideA(double sideA) {
		
		if (sideA < 0) {
			sideA = Math.abs(sideA);
		} else if (sideA == 0) {
			sideA = 1.0;
		}
		
		this.sideA = sideA;
		
	}



	public double getSideB() {
		return sideB;
	}



	public void setSideB(double sideB) {
		if (sideB < 0) {
			sideB = Math.abs(sideB);
		} else if (sideA == 0) {
			sideB = 1.0;
		}
		
		this.sideB = sideB;
	}



	public double getSideC() {
		return sideC;
	}



	public void setSideC(double sideC) {
		if (sideC < 0) {
			sideC = Math.abs(sideC);
		} else if (sideC == 0) {
			sideC = 1.0;
		}
		
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
		
		boolean sides = validSides();
		boolean sideCheck = validSideLength();
		
		return sides && sideCheck; 
	}



	private boolean validSideLength() {
		boolean sideCheck = (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideB > sideC) && (sideC + sideA > sideB);
		return sideCheck;
	}



	private boolean validSides() {
		boolean sides = sideA > 0 && sideB > 0 && sideC > 0;
		return sides;
	}
	
	
	public void printPerimeter() {
		
		double perimeter = calculatePerimeter();
			
		if (perimeter > 0) {
	        System.out.println("Triangle perimeter: " + perimeter);
	    }
	}
	
	
}
