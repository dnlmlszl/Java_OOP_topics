package TacePao.classes;

public class ClassesMain {

	public static void main(String[] args) {
		SuperClass oo1 = new SuperClass();
		oo1.osPubInt = 3;
		
		oo1.setOsPriInt(4);
		
		int i = oo1.getOsPriInt();
		System.out.println("001 print: " + i);
		
		SuperClass oo2 = new SuperClass();
		oo2.osPubInt = 3;
		
		oo2.setOsPriInt(6);
		
		i = oo2.getOsPriInt();
		System.out.println("002 print: " + i);
	}

}
