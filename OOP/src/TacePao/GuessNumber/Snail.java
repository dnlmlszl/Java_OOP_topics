package TacePao.GuessNumber;

import java.util.Random;

public class Snail {
	private String name;
	private int position;
	private Random random = new Random();
	
	public Snail(String name) {
		this.name = name;
		this.position = 0;
	}
	
	public String getName() {
		return name;
	}
	public int getPosition() {
		return position;
	}
	
	public void move() {
		position += random.nextInt(3) + 1;
	}
	
	public String toString() {
		return String.format("%s is at position %d", name, position);
	}
}
