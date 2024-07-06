package TacePao.GamesMenuSelection.domain;

import java.util.Random;

public class Snail {
	private String name;
	private int position;
	private int speed;
	private Random random;
	
	public Snail(String name) {
		this.name = name;
		this.position = 0;
		this.random = new Random();
		this.speed = random.nextInt(10) + 1;
		
	}
	
	public String getName() {
		return name;
	}
	public int getPosition() {
		return position;
	}
	
	public void move() {
		speed = random.nextInt(10) + 1;
		position += speed;
	}
	public void boostSpeed() {
		if (random.nextInt(100) < 20) {
			this.speed += random.nextInt(10) + 1;
			System.out.println(name + " has received a speed boost!");
		}
	}
	
	public String toString() {
		return String.format("%s is at position %d", name, position);
	}
}
