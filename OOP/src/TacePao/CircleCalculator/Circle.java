package TacePao.CircleCalculator;

public class Circle extends Shape {

    public Circle(String name, int radius) {
        super(name, radius);
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * pi;
    }

    @Override
    public double calculatePerimeter() {
        return radius * pi * 2;
    }

    @Override
    public String toString() {
        return String.format("%s has an area of %.2f and a perimeter of %.2f", super.toString(), calculateArea(), calculatePerimeter());
    }
}
