package TacePao.GuessNumber;


public class Player {
	private String name;
	private int guess;
	
	public Player(String name) {
		this.name = name;
	}
	public void guessNum() {
		
		guess = (int) (Math.random() * 10) + 1;
	}
	public int getGuess() {
		return guess;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return String.format("%s guessed: %d", name, guess);
	}

}
