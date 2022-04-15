package pl.chwilaprogramowaniadladebila;

public class Main {


    public static void main(String[] args) {
        Elections.wannaplay();
        while (Elections.gamecontinue) {

            Elections.choice();
            Elections.computerchoice();
            Condition.condition();

            }
        }
    }

