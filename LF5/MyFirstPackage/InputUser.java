package MyFirstPackage;

import java.util.Scanner;

public class InputUser{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --- Aufgabe 1: Ganze Zahl einlesen ---
        System.out.println("Geben Sie eine ganze Zahl ein: ");
        int ganzeZahl = input.nextInt();
        System.out.println("Die eingegebene ganze Zahl lautet: " + ganzeZahl);

        // --- Aufgabe 2: Kommazahl einlesen ---
        System.out.println("Geben Sie eine Kommazahl ein (z.B. 2,4): ");
        double kommazahl = input.nextDouble();
        System.out.println("Die eingegebene Kommazahl lautet: " + kommazahl);

        // Scanner-Puffer leeren, damit nextLine danach funktioniert
        input.nextLine();

        // --- Aufgabe 3: String einlesen ---
        System.out.println("Geben Sie einen Text ein: ");
        String text = input.nextLine();
        System.out.println("Der eingegebene Text lautet: " + text);

        System.out.println("Danke für die Eingaben!");
    }
}
