package exercise1;

import exercise1.model.Auto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tesztelés: Auto létrehozása alapértelmezett konstruktorral (üzemanyag van, nincs beindítva)
        Auto auto1 = new Auto();
        System.out.println("Auto1 létrehozva alapértelmezett konstruktorral:");
        System.out.println("Auto1 beindítva: " + auto1.isBeinditva());
        System.out.println("Auto1 üzemanyag: " + auto1.isUzemanyag());

        assert !auto1.isBeinditva() : "Hiba: Az autó alapértelmezett állapotban nem lehet beindítva.";
        assert auto1.isUzemanyag() : "Hiba: Az autó alapértelmezett állapotban kellene, hogy legyen üzemanyag.";

        // Tesztelés: Auto létrehozása paraméterezett konstruktorral (beindítva, üzemanyag van)
        Auto auto2 = new Auto(false, true);
        System.out.println("\nAuto2 létrehozva paraméterezett konstruktorral:");
        System.out.println("Auto2 beindítva: " + auto2.isBeinditva());
        System.out.println("Auto2 üzemanyag: " + auto2.isUzemanyag());
        assert auto2.isBeinditva() : "Hiba: Az autó beindítva kellene, hogy legyen.";
        assert auto2.isUzemanyag() : "Hiba: Az autóban kellene, hogy legyen üzemanyag.";

        // Tesztelés: Auto tankolása
        System.out.println("\nAuto1 tankolás előtt:");
        System.out.println("Auto1 tankolás elott üzemanyag: " + auto1.isUzemanyag());
        auto1.setBeinditva(true);        
        auto1.megy();
        System.out.println("Auto megy, kifogy az uzemanyag: " + auto1.isUzemanyag());
        System.out.println("Auto tankolas elott: " + auto1.isUzemanyag());
        
        auto1.tankol();
        System.out.println("Auto1 tankolás után:");
        System.out.println("Auto1 üzemanyag: " + auto1.isUzemanyag());
        assert auto1.isUzemanyag() : "Hiba: Az autó tankolás után kellene, hogy legyen üzemanyag.";

        // Tesztelés: Auto beindítása
        System.out.println("\nAuto1 indítás előtt:");
        System.out.println("Auto1 beindítva: " + auto1.isBeinditva());
        auto1.setBeinditva(true);
        System.out.println("Auto1 indítás után:");
        System.out.println("Auto1 beindítva: " + auto1.isBeinditva());
        assert auto1.isBeinditva() : "Hiba: Az autónak beindítva kellene lennie.";

        // Tesztelés: Auto haladása (20% eséllyel defektet kap)
        System.out.println("\nAuto1 haladás előtt:");
        System.out.println("Auto1 defekt: " + auto1.isDefekt());
        auto1.megy();
        
        System.out.println("Auto1 haladás után (lehetséges defekt):");
        System.out.println("Auto1 defekt: " + auto1.isDefekt());
        if (auto1.isDefekt()) {
            assert auto1.isDefekt() : "Hiba: Az autónak defektesnek kellene lennie.";
            auto1.setBeinditva(false);
            auto1.kereketCserel();
            System.out.println("Auto1 kerékcsere után:");
            System.out.println("Auto1 defekt: " + !auto1.isDefekt());
            System.out.println("Auto1 pótkerék: " + auto1.getPotkerek());
            assert !auto1.isDefekt() : "Hiba: Az autónak nem kellene defektesnek lennie a kerékcsere után.";
            assert auto1.getPotkerek() == 0 : "Hiba: A pótkerék száma nem csökkent megfelelően.";
        } else {
            assert !auto1.isDefekt() : "Hiba: Az autónak nem kellene defektesnek lennie.";
            assert !auto1.isUzemanyag() : "Hiba: Az üzemanyagnak el kellett volna fogynia.";
        }

        // Tesztelés: Defekttel nem lehet haladni
        auto1.defektetKap();
        System.out.println("\nAuto1 defektet kap:");
        System.out.println("Auto1 defekt: " + auto1.isDefekt());
        auto1.megy();
        System.out.println("Auto1 haladás után defekttel:");
        System.out.println("Auto1 üzemanyag: " + auto1.isUzemanyag());
        System.out.println("Auto1 beindítva: " + auto1.isBeinditva());
        assert auto1.isUzemanyag() : "Hiba: Defekt esetén az üzemanyagnak nem kellett volna fogynia.";
        assert !auto1.isBeinditva() : "Hiba: Defekt esetén az autónak nem kellett volna haladnia.";

        // Tesztelés: Nem lehet kereket cserélni, ha nincs defekt
        auto1.setDefekt(false);
        System.out.println("\nAuto1 kerékcsere defekt nélkül:");
        System.out.println("Auto1 pótkerék a csere előtt: " + auto1.getPotkerek());
        auto1.kereketCserel();
        System.out.println("Auto1 pótkerék a csere után: " + auto1.getPotkerek());
        assert auto1.getPotkerek() == 0 : "Hiba: Defekt nélkül nem lehetett volna kereket cserélni.";
    }

}
