package TacePao.Inheritance.Animals;

public class Bird extends Animal{
	
	public Bird(String name, String species) {
		super(name, species);
	}
	
	public void fly() {
		System.out.printf("%s is flying.\n", this.getName());
	}
	public void sing() {
		System.out.printf("%s is singing.\n", this.getName());
	}

}
