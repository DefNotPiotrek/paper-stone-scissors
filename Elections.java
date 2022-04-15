package pl.chwilaprogramowaniadladebila;

import java.util.Random;
import java.util.Scanner;

public class Elections {

    static boolean gamecontinue = true;
    static boolean loop = true;
    static int player = 0;
    static int computer;

    public static void wannaplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nCzy chcesz zagrać w Papier, Kamień, Nożyce? (y/n): ");
        String uwannaplay = scanner.nextLine();
        if (uwannaplay.equals("y")) {
            System.out.println("\nZaczynamy");
        } else if (uwannaplay.equals("n")) {
            System.out.println("\nTrudno");
            gamecontinue = false;
        } else {
            System.out.println("\nMusisz napisać tak(y), albo nie(n)");
        }
    }

    public static void choice() {
        while (loop) {
            System.out.println("\nWybierz:\n1. Papier\n2. Kamień\n3. Nożyce\n");

            Scanner scanner = new Scanner(System.in);
            player = scanner.nextInt();
            switch (player) {
                case 1 -> {
                    System.out.println("\nWybrałeś Papier!");
                    player = 1;
                    loop = false;
                }
                case 2 -> {
                    System.out.println("\nWybrałeś Kamień!");
                    player = 2;
                    loop = false;
                }
                case 3 -> {
                    System.out.println("\nWybrałeś Nożyce!");
                    player = 3;
                    loop = false;
                }
                default -> System.out.println("Wybór nie jest poprawny!");
            }
        }
    }
    public static void computerchoice() {
        Random random = new Random();
        computer = random.nextInt(3) + 1;
        System.out.println();
        switch (computer) {
            case 1 -> {
                System.out.println("Przeciwnik wybrał Papier!\n");
                computer = 1;
            }
            case 2 -> {
                System.out.println("Przeciwnik wybrał Kamień!\n");
                computer = 2;
            }
            case 3 -> {
                System.out.println("Przeciwnik wybrał Nożyce!\n");
                computer = 3;
            }
        }
    }
}
