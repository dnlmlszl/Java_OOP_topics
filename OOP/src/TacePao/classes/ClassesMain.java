package TacePao.classes;

public class ClassesMain {

	public static void main(String[] args) {
		SuperClass oo1 = new SuperClass();
        oo1.osPubInt = 3;

        oo1.setOsPriInt(4);

        int i = oo1.getOsPriInt();
        System.out.println("001 os print: " + i);
        System.out.println("001_i os pri: " + oo1.getOsPriInt());
        System.out.println("001_i os pub: " + oo1.getOsPubInt());
        System.out.println("001_i os prot: " + oo1.getOsProtInt());

        SuperClass oo2 = new SuperClass();
        oo2.osPubInt = 3;

        oo2.setOsPriInt(6);

        i = oo2.getOsPriInt();
        System.out.println("002 print: " + i);

        SuperClass oo3 = new SuperClass();

        oo3.getOsPriInt();

        i = oo3.getOsPriInt();
        System.out.println("003 print: " + i);

        SubClass uop1 = new SubClass(2);
        i = uop1.getOsPriInt();
        System.out.println("uop1 print: " + i);
        System.out.println("uop1_i utod pub: " + uop1.osPubInt);

        SubClass uop2 = new SubClass(1, 2, 3);
        i = uop2.getOsPriInt();
        System.out.println("uop2 print: " + i);
        i = uop2.getUtodPriInt();
        System.out.println("uop2_i os pub: " + uop2.osPubInt);
        System.out.println("uop2_i os pri: " + uop2.getOsPriInt());
        System.out.println("uop2_i utod pri: " + uop2.getUtodPriInt());
        System.out.println("uop2_i utod prot: " + uop2.getOsProtInt());
    }

}
