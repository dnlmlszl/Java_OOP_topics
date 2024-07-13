package CarsOOP;

import java.util.Scanner;

public class AutoUserInterface {
    private Car car;
    private Scanner scanner;

    public AutoUserInterface() {
        this.car = new Car();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean quit = false;
        while (!quit) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tankolasMenu();
                    break;
                case 2:
                    inditasMenu();
                    break;
                case 3:
                    leallitasMenu();
                    break;
                case 4:
                    megyMenu();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Érvénytelen választás!");
            }
        }
        System.out.println("Program vége.");
        scanner.close();
    }

    private void printMenu() {
        System.out.println("----------- Autó kezelése -----------");
        System.out.println("1. Tankolás");
        System.out.println("2. Indítás");
        System.out.println("3. Leállítás");
        System.out.println("4. Menet közbeni műveletek");
        System.out.println("5. Kilépés");
        System.out.print("Válasszon: ");
    }

    private void tankolasMenu() {
        System.out.print("Mennyi üzemanyagot tankoljon? ");
        int mennyiseg = scanner.nextInt();
        car.tankol(mennyiseg);
    }

    private void inditasMenu() {
        car.indit();
    }

    private void leallitasMenu() {
        car.leallit();
    }

    private void megyMenu() {
        car.megy();
    }

}
