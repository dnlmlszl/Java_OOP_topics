package TacePao.classes;

public class SuperClass {
	/* Adattagok */
	
	private int osPriInt;
	public int osPubInt;
	protected int osProtInt;
	
	/* Tagfuggvenyek */
	// konstruktor
	
	public SuperClass() {
		this(1);
	}
	
	public SuperClass(int osPriInt) {
		this.osProtInt = 100;
		setOsPriInt(osPriInt);
	}
	
	public SuperClass(int osPriInt, int osPubInt) {
		setOsPriInt(osPriInt);
		this.osPubInt = osPubInt;
		this.osProtInt = 100;
	}
	
	public int getOsPriInt() {
		return osPriInt;
	}
	
	public int getOsPubInt() {
		return osPubInt;
	}
	public int getOsProtInt() {
		return osProtInt;
	}
	
	public void setOsPriInt(int osPriInt) {
		
		if (osPriInt <= 0) {
			osPriInt = 1;
		} 
		
		this.osPriInt = osPriInt;
	}

}
