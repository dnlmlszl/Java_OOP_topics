package tesztesetek;

import teglalap.Teglalap;

public class ObjektumMain {

	public static void main(String[] args) {
		
		azonosOldalTeruetTeszt();
		elteroOldalTeruletTeszt();
		maxOldalTeruletTeszt();
		pozitivOldalakTeruletTeszt();
        negativOldalakTeruletTeszt();
        zeroOldalakTeruletTeszt();
        maxErtekOldalakTeruletTeszt();
        elteroOldalakTeruletTeszt();
        keretSzinTeszt();

	}
	
	private static void keretSzinTeszt() {
	    System.out.println("\nKeret szín teszt");

	    // Teszt 1: Beállítás piros színre
	    Teglalap obj1 = new Teglalap(5, 10);
	    obj1.setKeretSzin("piros");
	    String kapottSzin = obj1.getKeretSzin();
	    String vartSzin = "piros";
	    String kapottStilus = obj1.getKeretStilus();
	    String vartStilus = "szaggatott";
	    
	    System.out.printf("Kapott: %s, Várt: %s%n", kapottSzin, vartSzin);
        assert kapottSzin.equals(vartSzin) : String.format("Hiba: %s nem %s", kapottSzin, vartSzin);
        System.out.printf("Kapott: %s, Várt: %s%n", kapottStilus, vartStilus);
        assert kapottStilus.equals(vartStilus)  : String.format("Hiba: %s nem %s", kapottStilus, vartStilus);
	    

	    // Teszt 2: Beállítás zöld színre
        Teglalap obj2 = new Teglalap(5, 10);
	    obj2.setKeretSzin("zold");
	    String kapottSzin2 = obj2.getKeretSzin();
	    String vartSzin2 = "zold";
	    String kapottStilus2 = obj2.getKeretStilus();
	    String vartStilus2 = "pont";
	    
	    System.out.printf("Kapott: %s, Várt: %s%n", kapottSzin2, vartSzin2);
        assert kapottSzin2.equals(vartSzin2) : String.format("Hiba: %s nem %s", kapottSzin2, vartSzin2);
        System.out.printf("Kapott: %s, Várt: %s%n", kapottStilus2, vartStilus2);
        assert kapottStilus2.equals(vartStilus2)  : String.format("Hiba: %s nem %s", kapottStilus2, vartStilus2);

	   
	}



	private static void maxOldalTeruletTeszt() {
		int a, b;
		
		System.out.println("\nMax oldal");
		a = Integer.MAX_VALUE; b = 2;
		Teglalap obj = new Teglalap(a, b);
		
		System.out.println(obj.info());
		long kapott = (long) obj.terulet();
		long vart = (long) a * b; 
		
		System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
		
	}

	private static void elteroOldalTeruletTeszt() {
		int a, b;
		
		System.out.println("\nEltero oldalak");
		a = 4; b = 3;
		Teglalap obj = new Teglalap(a, b);
		
		System.out.println(obj.info());
		int kapott = (int) obj.terulet();
		int vart = 12;
		
		System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d\n", a, b, vart);
		
	}

	private static void azonosOldalTeruetTeszt() {
		int a, b;
		
		System.out.println("Azonos oldalak");
		a = 1; b = 1;
		Teglalap obj = new Teglalap(a, b);
		
		System.out.println(obj.info());
		int kapott = (int) obj.terulet();
		int vart = 1;
		
		System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
        assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}
	
	private static void pozitivOldalakTeruletTeszt() {
	    int a, b;

	    System.out.println("\nPozitív oldalak területe teszt");
	    a = 5;
	    b = 7;
	    Teglalap obj = new Teglalap(a, b);

	    System.out.println(obj.info());
	    int kapott = (int) obj.terulet();
	    int vart = a * b;

	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}

	private static void negativOldalakTeruletTeszt() {
	    int a, b;

	    System.out.println("\nNegatív oldalak területe teszt");
	    a = -5;
	    b = -7;
	    Teglalap obj = new Teglalap(a, b);

	    System.out.println(obj.info());
	    int kapott = (int) obj.terulet();
	    int vart = a * b;

	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}

	private static void zeroOldalakTeruletTeszt() {
	    int a, b;

	    System.out.println("\nZéró oldalak területe teszt");
	    a = 0;
	    b = 5;
	    Teglalap obj = new Teglalap(a, b);

	    System.out.println(obj.info());
	    int kapott = (int) obj.terulet();
	    int vart = 0;

	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}

	private static void maxErtekOldalakTeruletTeszt() {
	    int a, b;

	    System.out.println("\nMaximális értékek területe teszt");
	    a = Integer.MAX_VALUE;
	    b = 2;
	    Teglalap obj = new Teglalap(a, b);

	    System.out.println(obj.info());
	    long kapott = obj.terulet(); 
	    long vart = (long) a * b;

	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}


	private static void elteroOldalakTeruletTeszt() {
	    int a, b;

	    System.out.println("\nEltérő oldalak területe teszt");
	    a = 6;
	    b = 3;
	    Teglalap obj = new Teglalap(a, b);

	    System.out.println(obj.info());
	    int kapott = (int) obj.terulet();
	    int vart = a * b;

	    System.out.printf("Kapott: %d, Várt: %d%n", kapott, vart);
	    assert kapott == vart : String.format("Hiba: %d * %d nem %d", a, b, vart);
	}

}
