package triangle;

public class Triangle {

	private static final double INVALID_SIDE = 1.0;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = validateSide(sideA, sideB, sideC);
        this.sideB = validateSide(sideB, sideA, sideC);
        this.sideC = validateSide(sideC, sideA, sideB);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = validateSide(sideA, this.sideB, this.sideC);
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = validateSide(sideB, this.sideA, this.sideC);
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = validateSide(sideC, this.sideA, this.sideB);
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
        return sideA > 0 && sideB > 0 && sideC > 0 &&
               (sideA + sideB > sideC) &&
               (sideB + sideC > sideA) &&
               (sideC + sideA > sideB);
    }

    private double validateSide(double side, double otherSide1, double otherSide2) {
        if (side > 0 && (otherSide1 + otherSide2) > side) {
            return side;
        } else {
            return INVALID_SIDE;
        }
    }

    public void printPerimeter() {
        double perimeter = calculatePerimeter();
        if (perimeter > 0) {
            System.out.println("Triangle perimeter: " + perimeter);
        }
    }

    @Override
    public String toString() {
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
	
	
	
}
