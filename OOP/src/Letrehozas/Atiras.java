package Letrehozas;

import Letrehozas.model.Haromszog;

public class Atiras {

	public static void main(String[] args) {
		Haromszog h = new Haromszog(2, 2, 3);
		Haromszog h2 = new Haromszog(0, 0, 0);
		Haromszog h3 = new Haromszog(1, 1, 2);
		
		
		System.out.println("Info h");
		System.out.println("Oldalak adatai: " + h.oldalakAdatai());
		System.out.println("Kerulet: " + h.kerulet());
		
		System.out.println("\nInfo h2");
		System.out.println("Oldalak adatai: " + h2.oldalakAdatai());
		System.out.println("Kerulet: " + h2.kerulet());
		
		System.out.println("\nInfo h3");
		System.out.println("Oldalak adatai: " + h3.oldalakAdatai());
		System.out.println("Kerulet: " + h3.kerulet());
	}
}
