package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class Condition {

    public static int playerscore = 0;
    public static int computerscore = 0;

    public static void condition() {
        if (Elections.player == Elections.computer) {
            System.out.println("Remis\n");
        } else if (Elections.player == 1 && Elections.computer == 2) {
            System.out.println("Wygrywasz runde!\n");
            playerscore++;
        } else if (Elections.player == 1 && Elections.computer == 3) {
            System.out.println("Runde Wygrywa Przeciwnik!\n");
            computerscore++;
        } else if (Elections.player == 2 && Elections.computer == 1) {
            System.out.println("Runde Wygrywa Przeciwnik!\n");
            computerscore++;
        } else if (Elections.player == 2 && Elections.computer == 3) {
            System.out.println("Wygrywasz runde!\n");
            playerscore++;
        } else if (Elections.player == 3 && Elections.computer == 1) {
            System.out.println("Wygrywasz runde!\n");
            playerscore++;
        } else if (Elections.player == 3 && Elections.computer == 2) {
            System.out.println("Runde Wygrywa Przeciwnik!\n");
            computerscore++;
        }

        Elections.player = 0;
        Elections.computer = 0;
        Elections.loop = true;
        System.out.println("Masz: " + playerscore + " punkt" + "");
        System.out.println("Przeciwnik ma: " + computerscore + " punkt" + "\n");

        if (playerscore == 3) {
            System.out.println("Wygrałeś!\n");
            System.out.println("Chcesz grać dalej? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            if (next.equals("y")) {
                playerscore = 0;
                computerscore = 0;
            } else if (next.equals("n")) {
                System.out.println("Dzięki za grę :)");
                Elections.gamecontinue = false;
            }

        } else if (computerscore == 3) {
            System.out.println("Przegrałeś!\n");
            System.out.println("Chcesz grać dalej? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            if (next.equals("y")) {
                playerscore = 0;
                computerscore = 0;
            } else if (next.equals("n")) {
                System.out.println("Dzięki za grę :)");
                Elections.gamecontinue = false;
            } else {
                System.out.println("Dzięki za grę :)");
            }
        }
    }
}
