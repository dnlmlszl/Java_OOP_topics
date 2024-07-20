package exercise1.model;

import java.util.Random;

public class Auto {
	private boolean uzemanyag;
	private boolean beinditva;
	private boolean defekt;
	private int potkerek;
	
	
	public Auto() {
		this(false, true);
	}
	
	public Auto(boolean beinditva, boolean uzemanyag) {
		this.beinditva = beinditva;
		this.uzemanyag = uzemanyag;
		this.defekt = false;
		this.potkerek = 1;
	}

	public boolean isUzemanyag() {
		return uzemanyag;
	}

	public void setUzemanyag(boolean uzemanyag) {
		this.uzemanyag = uzemanyag;
	}

	public boolean isBeinditva() {
		return beinditva;
	}

	public void setBeinditva(boolean beinditva) {
        if (beinditva && !uzemanyag) {
            throw new IllegalArgumentException("Nem lehet beindítani az autót üzemanyag nélkül.");
        }
        this.beinditva = beinditva;
    }

	public boolean isDefekt() {
		return defekt;
	}

	public void setDefekt(boolean defekt) {
		this.defekt = defekt;
	}

	public int getPotkerek() {
		
		return potkerek;
	}

	public void setPotkerek(int potkerek) {
		if (potkerek < 0) {
            throw new IllegalArgumentException("A pótkerék száma nem lehet negatív.");
        }
        this.potkerek = potkerek;
	}
	
	public void megy() {
        if (beinditva && uzemanyag && !defekt) {
            Random random = new Random();
            if (random.nextInt(100) < 20) {
                this.defekt = true;
                System.out.println("Defektet kapott az autó!");
            } else {
                this.uzemanyag = false;
                System.out.println("Az autó haladt, és elfogyott az üzemanyag.");
            }
            this.beinditva = false;
        }
    }
	
	public void tankol() {
        if (!beinditva) {
            this.uzemanyag = true;
        } else {
            throw new IllegalStateException("Nem lehet tankolni, amíg az autó be van indítva.");
        }
    }
	
	public void defektetKap() {
		this.defekt = true;
	}
	
	public void kereketCserel() {
        if (defekt && !beinditva) {
            if (potkerek > 0) {
                this.defekt = false;
                this.potkerek--;
            } else {
                throw new IllegalStateException("Nincs több pótkerék.");
            }
        } else if (!defekt) {
            throw new IllegalStateException("Nem lehet kereket cserélni, ha nincs defekt.");
        } else {
            throw new IllegalStateException("Nem lehet kereket cserélni, amíg az autó be van indítva.");
        }
    }

}
