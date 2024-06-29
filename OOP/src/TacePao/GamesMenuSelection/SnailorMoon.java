package TacePao.GamesMenuSelection;

import java.util.ArrayList;
import java.util.List;

public class SnailorMoon extends Game{
	
	public void start() {
		printGameName();
		System.out.println("Guess the winner!");
		List<Snail> snails = initializeSnails();
		List<BetMan> betmen = initializeBetMan();
		
		System.out.println("Bets:");
		betmen.forEach(BetMan::guessNum);
		betmen.forEach(betMan -> System.out.println(betMan.getName() + " bets on snail " + betMan.getGuess()));
        System.out.println();
		
		int distance = 25;
		boolean isWinner = false;
		boolean isWinnerFound = false;
		int round = 1;
		
		while (!isWinner) {
            System.out.printf("Round %d:\n", round);

            snails.forEach(Snail::move);
            snails.forEach(System.out::println);

            List<Snail> winners = snails.stream()
                    .filter(snail -> snail.getPosition() >= distance)
                    .toList();
            
            if (!winners.isEmpty()) {
                isWinner = true;
                System.out.println("Winners:");
                winners.forEach(winner -> System.out.println(winner.getName() + " wins!"));
            } else {
                System.out.println("No winners this round.");
            }

            for (BetMan betMan : betmen) {
                if (winners.stream().anyMatch(snail -> betMan.getGuess() == snails.indexOf(snail) + 1)) {
                    System.out.println(betMan.getName() + " guessed correctly!");
                    
                    isWinnerFound = true;
                    break;
                }
            }

            

            round++;
        }
		
		
		
	}
	private List<BetMan> initializeBetMan() {
		List<BetMan> betmen = new ArrayList<>();
		
		BetMan betman1 = new BetMan("Betman 1");
		BetMan betman2 = new BetMan("Betman 2");
		BetMan betman3 = new BetMan("Betman 3");
		
		betmen.add(betman1);
		betmen.add(betman2);
		betmen.add(betman3);
		
		return betmen;
	}

	private List<Snail> initializeSnails() {
		List<Snail> snails = new ArrayList<>();
		Snail snail1 = new Snail("Snail 1");
		Snail snail2 = new Snail("Snail 2");
		Snail snail3 = new Snail("Snail 3");
		
		snails.add(snail1);
		snails.add(snail2);
		snails.add(snail3);
		
		return snails;
	}
	
	public void printGameName() {
        
        System.out.println("\nWelcome to the Snailer Moon snail race!");
    }

}