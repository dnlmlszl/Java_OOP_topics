package TacePao.GamesMenuSelection;

import java.util.Scanner;

import TacePao.GamesMenuSelection.userinterface.Userinterface;

public class GameMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		Userinterface ui = new Userinterface();
        ui.displayMenu();

	}
}
