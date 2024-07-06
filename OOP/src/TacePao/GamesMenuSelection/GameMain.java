package TacePao.GamesMenuSelection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TacePao.GamesMenuSelection.domain.Game;
import TacePao.GamesMenuSelection.logic.GuessTheNumberGame;
import TacePao.GamesMenuSelection.logic.SnailorMoon;

public class GameMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		initializeGames();
		
	}

	private static void initializeGames() {
		List<Game> games = prepareGamesList();
		
		System.out.println("Choose an option which game to run - #0 exits: ");
		System.out.println("#1 - hit 1 to start the Guess the Number game!");
		System.out.println("#2 - hit 2 to start the epic Snailor Moon game!");
		int option;
		
		while (true) {
		
			try {
                option = Integer.parseInt(scanner.nextLine());
                if (option == 0) break;
    			
    			switch (option) {
    			case 1:
    				games.get(0).start();
    				break;
    			case 2:
    				games.get(1).start();
    				break;
    			default:
    				System.out.println("Please, select a valid option!");
    				continue;
    			}
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please select a valid one.");
            }		
			
		}
	}


	private static List<Game> prepareGamesList() {
		List<Game> games = new ArrayList<> ();
		
		games.add(new GuessTheNumberGame());
		games.add(new SnailorMoon());
		return games;
	}

}
