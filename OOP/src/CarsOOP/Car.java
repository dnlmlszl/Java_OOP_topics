package CarsOOP;

public class Car {
    private int uzemanyag;
    private boolean beinditva;

    public Car() {
        this.beinditva = false;
        this.uzemanyag = 0; 
    }

    public int getUzemanyag() {
        return uzemanyag;
    }

    public boolean getBeinditva() {
        return beinditva;
    }

    public void tankol(int mennyiseg) {
        if (!beinditva) {
            this.uzemanyag += mennyiseg;
            System.out.println("Tankolás megtörtént. Aktuális üzemanyag mennyiség: " + uzemanyag);
        } else {
            System.out.println("Nem lehet tankolni, amíg az autó be van indítva.");
        }
    }

    public void indit() {
        if (!beinditva) {
            if (uzemanyag > 0) {
                this.beinditva = true;
                System.out.println("Az autó el lett indítva.");
            } else {
                System.out.println("Nincs üzemanyag, nem lehet elindítani.");
            }
        } else {
            System.out.println("Az autó már el lett indítva.");
        }
    }

    public void leallit() {
        if (beinditva) {
            this.beinditva = false;
            System.out.println("Az autó le lett állítva.");
        } else {
            System.out.println("Az autó már le lett állítva.");
        }
    }

    public void megy() {
        if (beinditva) {
            while (uzemanyag > 0) {
                uzemanyag--;
            }
            System.out.println("Az autó elindult és elfogyott az üzemanyag.");
            leallit(); 
        } else {
            System.out.println("Az autó nincs beindítva, indítsa el először.");
        }
    }
}
