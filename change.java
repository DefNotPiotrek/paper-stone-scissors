package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class change {

    public static double howmuch = 0;
    public static boolean continuechoose = true;

    public static void changecentimeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPodaj liczbę centymetrów: ");
        howmuch = scanner.nextInt();
        while (continuechoose) {
            System.out.println("\nNa co chcesz zamienić?:\n1.milimetry\n2.Decymetry\n3.Metry\n4.Kilometry\n5.Zakończ\n");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    double millimeters = howmuch * 10;
                    System.out.println("\n" + howmuch + " centymetr/ów to " + millimeters + " milimetr/ów\n");
                    continuechoose = false;
                }
                case 2 -> {
                    double decimeters = (int) (howmuch / 10);
                    System.out.println("\n" + howmuch + " centymetr/ów to " + decimeters + " decymetr/ów\n");
                    continuechoose = false;
                }
                case 3 -> {
                    double meters = (int) (howmuch / 100);
                    System.out.println("\n" + howmuch + " centymetr/ów to " + meters + " metry/ów\n");
                    continuechoose = false;
                }
                case 4 -> {
                    double kilometers = (int) (howmuch / 100000);
                    System.out.println("\n" + howmuch + " centymetr/ów to " + kilometers + " kilometr/ów\n");
                    continuechoose = false;
                }
                case 5 -> continuechoose = false;

                default -> System.out.println("Podaj poprawną wartość");
            }
        }
    }

    public static void changemilimeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPodaj liczbę milimetrów: ");
        howmuch = scanner.nextInt();
        while (continuechoose) {
            System.out.println("\nNa co chcesz zamienić?:\n1.Centymetry\n2.Decymetry\n3.Metry\n4.Kilometry\n5.Zakończ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    double centimeters = howmuch / 10;
                    System.out.println("\n" + howmuch + " milimetr/ów to " + centimeters + " centymetr/ów\n");
                    continuechoose = false;
                }
                case 2 -> {
                    double decimeters = howmuch / 100;
                    System.out.println("\n" + howmuch + " milimetr/ów to " + decimeters + " decymetr/ów\n");
                    continuechoose = false;
                }
                case 3 -> {
                    double meters = howmuch / 1000;
                    System.out.println("\n" + howmuch + " milimetr/ów to " + meters + " metry/ów\n");
                    continuechoose = false;
                }
                case 4 -> {
                    double kilometers = howmuch / 1000000;
                    System.out.println("\n" + howmuch + " milimetr/ów to " + kilometers + " kilometr/ów\n");
                    continuechoose = false;
                }
                case 5 -> continuechoose = false;

                default -> System.out.println("Podaj poprawną wartość");
            }
        }
    }
    public static void changedecimeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPodaj liczbę decymetrów: ");
        howmuch = scanner.nextInt();
        while (continuechoose) {
            System.out.println("\nNa co chcesz zamienić?:\n1.Centymetry\n2.Milimetry\n3.Metry\n4.Kilometry\n5.Zakończ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    double centimeters = howmuch * 10;
                    System.out.println("\n" + howmuch + " decymetr/ów to " + centimeters + " centymetr/ów\n");
                    continuechoose = false;
                }
                case 2 -> {
                    double milimeters = howmuch * 100;
                    System.out.println("\n" + howmuch + " decymetr/ów to " + milimeters + " milimetr/ów\n");
                    continuechoose = false;
                }
                case 3 -> {
                    double meters = howmuch / 10;
                    System.out.println("\n" + howmuch + " decymetr/ów to " + meters + " metry/ów\n");
                    continuechoose = false;
                }
                case 4 -> {
                    double kilometers = howmuch / 10000;
                    System.out.println("\n" + howmuch + " decymetr/ów to " + kilometers + " kilometr/ów\n");
                    continuechoose = false;
                }
                case 5 -> continuechoose = false;

                default -> System.out.println("Podaj poprawną wartość");
            }
        }
    }
    public static void changemeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPodaj liczbę metrów: ");
        howmuch = scanner.nextInt();
        while (continuechoose) {
            System.out.println("\nNa co chcesz zamienić?:\n1.Centymetry\n2.Milimetry\n3.Decymetry\n4.Kilometry\n5.Zakończ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    double centimeters = howmuch * 100;
                    System.out.println("\n" + howmuch + " metr/ów to " + centimeters + " centymetr/ów\n");
                    continuechoose = false;
                }
                case 2 -> {
                    double milimeters = howmuch * 1000;
                    System.out.println("\n" + howmuch + " metr/ów to " + milimeters + " milimetr/ów\n");
                    continuechoose = false;
                }
                case 3 -> {
                    double decimeters = howmuch * 10;
                    System.out.println("\n" + howmuch + " metr/ów to " + decimeters + " decymetr/ów\n");
                    continuechoose = false;
                }
                case 4 -> {
                    double kilometers = howmuch / 1000;
                    System.out.println("\n" + howmuch + " metr/ów to " + kilometers + " kilometr/ów\n");
                    continuechoose = false;
                }
                case 5 -> continuechoose = false;

                default -> System.out.println("Podaj poprawną wartość");
            }
        }
    }
    public static void kilometers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPodaj liczbę kilometrów: ");
        howmuch = scanner.nextInt();
        while (continuechoose) {
            System.out.println("\nNa co chcesz zamienić?:\n1.Centymetry\n2.Milimetry\n3.Decymetry\n4.Metry\n5.Zakończ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    double centimeters = howmuch * 100000;
                    System.out.println("\n" + howmuch + " kilometr/ów to " + centimeters + " centymetr/ów\n");
                    continuechoose = false;
                }
                case 2 -> {
                    double milimeters = howmuch * 1000000;
                    System.out.println("\n" + howmuch + " kilometr/ów to " + milimeters + " milimetr/ów\n");
                    continuechoose = false;
                }
                case 3 -> {
                    double decimeters = howmuch * 10000;
                    System.out.println("\n" + howmuch + " kilometr/ów to " + decimeters + " decymetr/ów\n");
                    continuechoose = false;
                }
                case 4 -> {
                    double meters = howmuch * 1000;
                    System.out.println("\n" + howmuch + " kilometr/ów to " + meters + " metr/ów\n");
                    continuechoose = false;
                }
                case 5 -> continuechoose = false;

                default -> System.out.println("Podaj poprawną wartość");
            }
        }
    }
}
