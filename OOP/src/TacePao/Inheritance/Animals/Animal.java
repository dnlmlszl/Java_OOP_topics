package TacePao.Inheritance.Animals;

public class Animal {
	
	private String name;
	private String species;
	
	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	public String getName() {
		return name;
	}
	
	public void walk() {
		System.out.printf("%s is walking.\n", this.name);
	}
	
	public String toString() {
		return String.format("Hi, I am %s, i am a %s.", name, species);
	}

}
