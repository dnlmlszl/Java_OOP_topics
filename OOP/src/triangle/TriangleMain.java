package triangle;

public class TriangleMain {

	public static void main(String[] args) {

		testTriangle();
		
		
	}

	private static void testTriangle() {
		Triangle triangle1 = new Triangle(3, 4, 5);
		System.out.println("Triangle 1:");
		triangle1.printPerimeter();
		
		Triangle triangle2 = new Triangle(1, 1, 10);
        System.out.println("Triangle 2:");
        triangle2.printPerimeter(); 
        
        Triangle triangle3 = new Triangle(-2, 3, 4);
        System.out.println("Triangle 3:");
        triangle3.printPerimeter();
	}

}
