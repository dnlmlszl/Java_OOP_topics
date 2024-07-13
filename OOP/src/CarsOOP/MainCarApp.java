package CarsOOP;

import java.util.Scanner;

import CarsOOP.ui.AutoUserInterface;

public class MainCarApp {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        AutoUserInterface userInterface = new AutoUserInterface(scanner);
        userInterface.run();
    }

}
