package TacePao.GuessNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	
	public UserInterface() {
		scanner = new Scanner(System.in);
	}
	
	public void start() {
		List<Player> players = new ArrayList<>();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		Player player3 = new Player("Player 3");
		System.out.println("Players guess a number until a match.");
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		
		int target = (int) (Math.random() * 10) + 1;
		boolean winner = false;
		System.out.println("The number: " + target);
		
		while (!winner) {
			
			players.forEach(Player::guessNum);
			
			players.forEach(System.out::println);
			
			winner = players.stream()
	                .anyMatch(player -> {
	                    if (player.getGuess() == target) {
	                        System.out.println(player.getName() + " wins!");
	                        return true;
	                    }
	                    return false;
	                });
			
			if (!winner) System.out.println("No one guessed correctly!");

		}
	}

}
