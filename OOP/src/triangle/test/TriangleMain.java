package triangle.test;

import triangle.Triangle;

public class TriangleMain {

	public static void main(String[] args) {

		testTriangle();
		
		
	}
	
	private static void testTriangle() {
		/*Triangle triangle1 = new Triangle(3, 4, 5);
		System.out.println("Triangle 1:");
		triangle1.printPerimeter();
		
		triangle1.setSideA(6);
		triangle1.setSideB(19);
		triangle1.setSideC(14);
		
		System.out.println("Triangle 1 after reset:");
		triangle1.printPerimeter();
		
		Triangle triangle2 = new Triangle(1, 1, 10);
        System.out.println("Triangle 2:");
        triangle2.printPerimeter(); 
        
        Triangle triangle3 = new Triangle(-2, 3, 4);
        System.out.println("Triangle 3:");
        triangle3.printPerimeter();*/
        
        oldalBeallitasTeszt();
        ertekesKeruletTeszt();
        ervenytelenHaromszogTeszt();
        hibasBemenetiAdatokTeszt();
	}
	
	private static void oldalBeallitasTeszt() {
        System.out.println("\nOldal beállítás teszt");

        // Teszt 1: Negatív oldal
        Triangle triangle1 = new Triangle(-3, 4, 5);
        triangle1.setSideA(-3);
        triangle1.setSideB(-4);
        triangle1.setSideC(-5);
        System.out.printf("Oldal A: %.2f, Várt: %.2f%n", triangle1.getSideA(), 3.0);
        System.out.printf("Oldal B: %.2f, Várt: %.2f%n", triangle1.getSideB(), 4.0);
        System.out.printf("Oldal C: %.2f, Várt: %.2f%n", triangle1.getSideC(), 5.0);
        assert triangle1.getSideA() == 3.0 : "Hiba: A oldal nem helyes";
        assert triangle1.getSideB() == 4.0 : "Hiba: B oldal nem helyes";
        assert triangle1.getSideC() == 5.0 : "Hiba: C oldal nem helyes";

        // Teszt 2: Nullás oldal
        Triangle triangle2 = new Triangle(0, 1, 2);
        triangle2.setSideA(0);
        triangle2.setSideB(1);
        triangle2.setSideC(2);
        System.out.printf("Oldal A: %.2f, Várt: %.2f%n", triangle2.getSideA(), 1.0);
        System.out.printf("Oldal B: %.2f, Várt: %.2f%n", triangle2.getSideB(), 1.0);
        System.out.printf("Oldal C: %.2f, Várt: %.2f%n", triangle2.getSideC(), 2.0);
        assert triangle2.getSideA() == 1.0 : "Hiba: A oldal nem helyes";
        assert triangle2.getSideB() == 1.0 : "Hiba: B oldal nem helyes";
        assert triangle2.getSideC() == 2.0 : "Hiba: C oldal nem helyes";
        
        
    }

    private static void ertekesKeruletTeszt() {
        System.out.println("\nÉrtékes kerület teszt");

        Triangle triangle = new Triangle(3, 4, 5);
        double kapott = triangle.calculatePerimeter();
        double vart = 12.0;

        System.out.printf("Kapott: %.2f, Várt: %.2f%n", kapott, vart);
        
        // assert Math.abs(kapott - vart) < 1e-9 : "Hiba: A kerület nem helyes";

        assert kapott == vart : "Hiba: A kerület nem helyes";
    }

    private static void ervenytelenHaromszogTeszt() {
        System.out.println("\nÉrvénytelen háromszög teszt");

        Triangle triangle = new Triangle(1, 2, 3);
        double kapott = triangle.calculatePerimeter();
        double vart = 0.0;

        System.out.printf("Kapott: %.2f, Várt: %.2f%n", kapott, vart);
        
        //assert Math.abs(kapott - vart) < 1e-9 : "Hiba: A kerület nem helyes";

        assert kapott == vart : "Hiba: Az érvénytelen háromszög kerülete nem helyes";
    }

    private static void hibasBemenetiAdatokTeszt() {
        System.out.println("\nHibás bemeneti adatok teszt");

        Triangle triangle = new Triangle(10, 20, 30);
        triangle.setSideA(10);
        triangle.setSideB(20);
        triangle.setSideC(30);
        double kapott = triangle.calculatePerimeter();
        double vart = 0.0;

        System.out.printf("Kapott: %.2f, Várt: %.2f%n", kapott, vart);
        
        // assert Math.abs(kapott - vart) < 1e-9 : "Hiba: A kerület nem helyes";

        assert kapott == vart : "Hiba: Hibás bemeneti adatok esetén a kerület nem helyes";
    }

}
