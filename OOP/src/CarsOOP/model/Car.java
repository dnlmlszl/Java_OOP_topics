package CarsOOP.model;

public class Car implements CarInterface{
    private int uzemanyag;
    private boolean beinditva;

    public Car() {
        this.beinditva = false;
        this.uzemanyag = 0; 
    }

    @Override
    public int getUzemanyag() {
        return uzemanyag;
    }

    @Override
    public boolean getBeinditva() {
        return beinditva;
    }

    @Override
    public void tankol(int mennyiseg) {
        if (!beinditva) {
            this.uzemanyag += mennyiseg;
            System.out.println("Tankolás megtörtént. Aktuális üzemanyag mennyiség: " + uzemanyag);
        } else {
            System.out.println("Nem lehet tankolni, amíg az autó be van indítva.");
        }
    }

    @Override
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

    @Override
    public void leallit() {
        if (beinditva) {
            this.beinditva = false;
            System.out.println("Az autó le lett állítva.");
        } else {
            System.out.println("Az autó már le lett állítva.");
        }
    }

    @Override
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autó állapota:\n");
        sb.append("Üzemanyag mennyisége: ").append(uzemanyag).append(" liter\n");
        sb.append("Beindítva: ").append(beinditva ? "Igen" : "Nem").append("\n");
        return sb.toString();
    }

}
