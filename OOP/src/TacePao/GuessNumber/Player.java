package TacePao.GuessNumber;

import java.util.Random;

public class Player {
	private String name;
	protected int guess;
	private Random random = new Random();
	
	public Player(String name) {
		this.name = name;
	}
	public void guessNum() {
		
		guess = random.nextInt(10);
	}
	public int getGuess() {
		return guess;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return String.format("%s guessed: %d", name, guess);
	}

}
