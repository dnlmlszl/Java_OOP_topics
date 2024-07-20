package Letrehozas.model;

public class Haromszog {
	
	private int a, b, c;
	private boolean mukodik;

	public Haromszog(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.mukodik = true;
        
        ellenorzes();
	}

	private void ellenorzes() {
		if(!szerkesztheto()){
			mukodik = false;
            beallit();
            
        }
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
		ellenorzes();
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
		ellenorzes();
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
		ellenorzes();
		
	}
	
	private boolean szerkesztheto(){
	    return a+b > c && a+c > b && b+c > a;
	}
	    
	private void beallit() {
	    a = 1;
	    b = 1;
	    c = 1;
	}
	
	public int kerulet() {
		
		int k =  getA() + getB() + getC();
		
		if (!mukodik) {
			return -1;
		}
		return k;
	}

	public String oldalakAdatai() {
		return getA() + ", " + getB() + ", " + getC(); 
	}
}
