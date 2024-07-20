package teglalap;

public class Teglalap {

	private int a, b;
	private String keretSzin, keretStilus;
	
	public Teglalap(int a, int b) {
		setA(a);
		setB(b);
		keretSzin = "piros";
		keretStilus = "szaggatott";
	}
	
	

	public void setKeretSzin(String keretSzin) {
		switch(keretSzin) {
		
		case "piros":
			this.keretSzin = "piros";
			this.keretStilus = "szaggatott";
			break;
		case "zold":
			this.keretSzin = "zold";
			this.keretStilus = "pont";
			break;
		default:
			this.keretSzin = "piros";
			this.keretStilus = "szaggatott";
			break;
		}
	}


	public String getKeretSzin() {
		return keretSzin;
	}



	public String getKeretStilus() {
		return keretStilus;
	}



	public int getA() {
		return a;
	}

	public void setA(int a) {
		if (a < 1) {
			a = 1;
		}
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if (b < 1) {
			b = 1;
		}
		this.b = b;
	}
	
	public String info() {
		
		return "Teglalap[a:" + a + " b: " + b + "]";
	}

	public long terulet() {
		
		return (long) a * b;
	}
}
