package debekaPH1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pythagoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dreieck = new int[3];
        int i = 0;

        System.out.println("Bitte geben Sie drei Seitenlängen des Dreiecks ein:");

        while (i < 3) {
            try {
                System.out.print("Seite " + (i + 1) + ": ");
                dreieck[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Ganzzahl ein.");
                scanner.next(); // ungültige Eingabe verwerfen
            }
        }

        boolean istRechtwinklig = isRechtwinkligesDreieck(dreieck);

        if (istRechtwinklig) {
            System.out.println("Das Dreieck ist rechtwinklig.");
        } else {
            System.out.println("Das Dreieck ist nicht rechtwinklig.");
        }

        scanner.close();
    }

    public static boolean isRechtwinkligesDreieck(int[] dreieckRE) {
        if (dreieckRE.length != 3) {
            throw new IllegalArgumentException("Das Array muss genau drei Seitenlängen enthalten.");
        }

        Arrays.sort(dreieckRE);

        return Math.pow(dreieckRE[0], 2) + Math.pow(dreieckRE[1], 2) == Math.pow(dreieckRE[2], 2);
    }
}