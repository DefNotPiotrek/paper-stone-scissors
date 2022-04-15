package pl.chwilaprogramowaniadladebila;

import java.util.Scanner;

public class choose {

    public static void choosemeasures(){
    Scanner scanner = new Scanner(System.in);
    boolean continuechoose = true;
    boolean loop = true;
        while (continuechoose) {
            System.out.println("Wybierz:\n1.Centymetry\n2.Milimetry\n3.Decymetry\n4.Metry\n5.Kilometry\n6.Zakończ\n");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    change.changecentimeters();
                    continuechoose = false;
                }
                case 2 -> {
                    change.changemilimeters();
                    continuechoose = false;
                }
                case 3 -> {
                    change.changedecimeters();
                    continuechoose = false;
                }
                case 4 -> {
                    change.changemeters();
                    continuechoose = false;
                }
                case 5 -> {
                    change.kilometers();
                    continuechoose = false;
                }
                case 6 -> {
                    continuechoose = false;
                    change.continuechoose = false;
                }
                default -> System.out.println("\nwybierz poprawną wartość\n");
            }
            loop = true;
            while (loop) {
                System.out.println("Chcesz kontynułować zamienianie jednostek?(y/n): ");
                scanner.nextLine();
                String choosecontinue = scanner.nextLine();
                if (choosecontinue.equals("y")) {
                    System.out.println();
                    loop = false;
                    continuechoose = true;
                    change.continuechoose = true;
                }
                else if (choosecontinue.equals("n")) {
                    System.out.println("Miłego dnia:)");
                    loop = false;
                }
                else{
                    System.out.println("Udziel poprawnej odpowiedzi");
                }
            }
        }
    }
}
