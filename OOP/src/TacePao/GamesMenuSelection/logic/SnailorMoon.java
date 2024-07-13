package TacePao.GamesMenuSelection.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import TacePao.GamesMenuSelection.domain.BetMan;
import TacePao.GamesMenuSelection.domain.Game;
import TacePao.GamesMenuSelection.domain.Snail;

public class SnailorMoon extends Game{
	private Random random = new Random();
	
	public void start() {
		printGameName();
		System.out.println("Guess the winner!");
		List<Snail> snails = initializeSnails();
		List<BetMan> betmen = initializeBetMan();
		
		System.out.println("Bets:");
		betmen.forEach(BetMan::guessNum);
		betmen.forEach(betMan -> System.out.println(betMan.getName() + " bets on snail " + betMan.getGuess()));
        System.out.println();
		
		int distance = 50;
		boolean isWinner = false;
		int round = 1;
		
		while (!isWinner) {
            System.out.printf("Round %d:\n", round);
            
            if (random.nextInt(100) < 20) { 
                Snail luckySnail = snails.get(random.nextInt(snails.size()));
                luckySnail.boostSpeed();
            } 

            snails.forEach(Snail::move);
            snails.forEach(System.out::println);

            List<Snail> winners = snails.stream()
                    .filter(snail -> snail.getPosition() >= distance)
                    .collect(Collectors.toList());

            if (!winners.isEmpty()) {
                isWinner = true;
                System.out.println("Winners:");
                winners.forEach(winner -> System.out.println(winner.getName() + " wins!"));

                for (BetMan betMan : betmen) {
                    if (winners.stream().anyMatch(snail -> betMan.getGuess() == snails.indexOf(snail) + 1)) {
                        System.out.println(betMan.getName() + " guessed correctly!");
                    }
                }
            } else {
                System.out.println("No winners this round.");
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