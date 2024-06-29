package TacePao.Inheritance.Animals;

public class Main {

	public static void main(String[] args) {

		Bird bird1 = new Bird("Benny", "Corvus corvus");
		
		System.out.println(bird1);
		
		bird1.walk();
		bird1.fly();
		bird1.sing();
	}

}
