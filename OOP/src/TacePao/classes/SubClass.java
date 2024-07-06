package TacePao.classes;

public class SubClass extends SuperClass {
	private int utodPriInt;
	
	public SubClass(int utodPriInt) {
		super();
		setUtodPriInt(utodPriInt);
	}
	
	public SubClass(int osPriInt, int osPubInt, int utodPriInt) {
		super(osPriInt, osPubInt);
		this.osProtInt = 200;
		setUtodPriInt(utodPriInt);
	}
	
	public int getUtodPriInt() {
		return utodPriInt;
	}
	
	public void setUtodPriInt(int utodPriInt) {
		
		if (utodPriInt < 5) {
			utodPriInt = 5;
		} 
		
		this.utodPriInt = utodPriInt;
	}

}
