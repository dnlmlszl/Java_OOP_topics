package TacePao.GamesMenuSelection;

import java.util.Random;

public class BetMan extends Player{
	private Random random = new Random();
	
	
	public BetMan(String name) {
		super(name);
		
	}
	
	@Override
	public void guessNum() {		
		
		guess = random.nextInt(3) + 1;
	}

}
