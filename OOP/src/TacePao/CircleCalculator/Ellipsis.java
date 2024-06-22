package TacePao.CircleCalculator;

public class Ellipsis extends Shape {
    private int radius2;

    public Ellipsis(String name, int radius1, int radius2) {
        super(name, radius1);
        this.radius2 = radius2;
    }

    @Override
    public double calculateArea() {
        return pi * radius * radius2;
    }

    @Override
    public double calculatePerimeter() {
        return pi * 2 * Math.sqrt((Math.pow(radius, 2) + Math.pow(radius2, 2)) / 2);
    }

    @Override
    public String toString() {
        return String.format("%s and %d has an area of %.2f and a perimeter of %.2f", super.toString(), radius2, calculateArea(), calculatePerimeter());
    }
}
