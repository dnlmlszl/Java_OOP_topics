package fuggveny;

import fuggveny.Fuggveny;

public class FuggvenyMain {

	public static void main(String[] args) {

		testTriangle();
		
		
	}

	private static void testTriangle() {
		       
        azonosakSzorzasaTeszt();
        kulonbozoekSzorzasaTeszt();
        
        pozitivSzorzasaTeszt();
        negativSzorzasaTeszt();
        pozitivNegativSzorzasaTeszt();
        nagySzamokSzorzasaTeszt();
        
        maxErtekekSzorzasaTeszt();
        hibasSzorzasaTeszt();
        explicitHibaTeszt();
        
	}
	
	private static void azonosakSzorzasaTeszt() {
        System.out.println("Azonosak szorzása teszt");
        int a = 0, b = 0;
        int kapott = Fuggveny.szorzas(a, b);
        int vart = 0;
        System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
    }
	
	private static void kulonbozoekSzorzasaTeszt() {
	    System.out.println("Különböző számok szorzása teszt");
	    int a = 3, b = 5;
	    int kapott = Fuggveny.szorzas(a, b);
	    int vart = 15;
	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}
	
	private static void maxErtekekSzorzasaTeszt() {
	    System.out.println("Maximális értékek szorzása teszt");
	    int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
	    long kapott = (long) Fuggveny.szorzas(a, b); 
	    long vart = (long) a * b;
	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}

    private static void pozitivSzorzasaTeszt() {
        System.out.println("Pozitív számok szorzása teszt");
        int a = 2, b = 3;
        int kapott = Fuggveny.szorzas(a, b);
        int vart = 6;
        System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
    }

    private static void negativSzorzasaTeszt() {
        System.out.println("Negatív számok szorzása teszt");
        int a = -2, b = -3;
        int kapott = Fuggveny.szorzas(a, b);
        int vart = 6;
        System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
    }

    private static void pozitivNegativSzorzasaTeszt() {
        System.out.println("Pozitív és negatív számok szorzása teszt");
        int a = 2, b = -3;
        int kapott = Fuggveny.szorzas(a, b);
        int vart = -6;
        System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
    }

    private static void nagySzamokSzorzasaTeszt() {
        System.out.println("Nagy számok szorzása teszt");
        int a = 1000, b = 2000;
        int kapott = Fuggveny.szorzas(a, b);
        int vart = 2000000;
        System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
    }

    private static void hibasSzorzasaTeszt() {
        System.out.println("Hibás teszt generálása");
        int a = -5, b = -6;
        int kapott = Fuggveny.szorzas(a, b);
        int vart = 30;  
        System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
    }
    
    private static void explicitHibaTeszt() {
        System.out.println("Explicit hiba teszt");
        assert false : "Ez egy szándékos hiba, hogy ellenőrizzük az assert működését";
    }

}
