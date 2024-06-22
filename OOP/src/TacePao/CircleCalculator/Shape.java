package TacePao.CircleCalculator;

public abstract class Shape {
    protected final double pi = Math.PI;
    protected int radius;
    protected String name;

    public Shape(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return String.format("%s with radius %d", name, radius);
    }
}
