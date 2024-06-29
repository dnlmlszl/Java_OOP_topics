package TacePao.GuessNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessTheNumberGame extends Game{
	private Random random = new Random();
	
	public void start() {
		printGameName();
		System.out.println("Players guess a number until a match.");
		
		
		List<Player> players = initializePlayers();
		
		int target = random.nextInt(10);
		boolean winner = false;
		
		
		menuLoop(players, target, winner);
	}

	private List<Player> initializePlayers() {
		List<Player> players = new ArrayList<>();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		Player player3 = new Player("Player 3");		
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		return players;
	}
	
	public void printGameName() {
        
        System.out.println("This is the Guess the Number game.");
    }

	private void menuLoop(List<Player> players, int target, boolean winner) {
		while (!winner) {
			System.out.println("The number: " + target);
			
			players.forEach(Player::guessNum);
			
			players.forEach(System.out::println);
			
			winner = players.stream()
                    .anyMatch(player -> player.getGuess() == target);
			
			if (winner) {
                System.out.println("The correct number was: " + target);
                System.out.println("Game over!");
                
                players.stream()
                        .filter(player -> player.getGuess() == target)
                        .forEach(player -> System.out.println(player.getName() + " wins!"));
            } else {
                System.out.println("No one guessed correctly!");
            }	
			
		}
	}

}
