package MyFirstPackage;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Ratespiel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int highscore = Integer.MAX_VALUE;
        long bestzeit = Long.MAX_VALUE;

        File file = new File("Ratespiel_sicherung.txt");

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                String line1 = reader.readLine();
                String line2 = reader.readLine();

                if (line1 != null) highscore = Integer.parseInt(line1);
                if (line2 != null) bestzeit = Long.parseLong(line2);

                System.out.println("Gespeicherter Highscore geladen.");
                System.out.println("Highscore: " + highscore + " Versuche");
                System.out.println("Beste Zeit: " + (bestzeit / 1000.0) + " Sekunden");

            } catch (Exception e) {
                System.out.println("Fehler beim Laden der Datei. Starte ohne gespeicherte Werte.");
            }
        }

        boolean weiterspielen = true;

        System.out.println("\nWillkommen beim Zahlerraten-Spiel!");
        System.out.println("Optimale Strategie: Nutze eine Art 'Binäre Suche', also immer die Mitte des möglichen Bereichs raten.");

        while (weiterspielen) {

            Random random = new Random();
            int gesuchteZahl = random.nextInt(100) + 1;

            int versuche = 0;
            int benutzerEingabe = -1;

            long startZeit = System.currentTimeMillis();

            System.out.println("\nNeue Runde! Rate die Zahl zwischen 1 und 100.");

            // Spielschleife
            while (benutzerEingabe != gesuchteZahl) {

                System.out.print("Gib deinen Tipp ein: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Fehler: Bitte gib eine gültige Zahl ein!");
                    scanner.next();
                    continue;
                }

                benutzerEingabe = scanner.nextInt();
                versuche++;

                if (benutzerEingabe < 1 || benutzerEingabe > 100) {
                    System.out.println("Bitte gib eine Zahl zwischen 1 und 100 ein!");
                    continue;
                }

                if (benutzerEingabe < gesuchteZahl) {
                    System.out.println("Die gesuchte Zahl ist größer!");
                } else if (benutzerEingabe > gesuchteZahl) {
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                }
            }

            long endZeit = System.currentTimeMillis();
            long benoetigteZeit = endZeit - startZeit;

            // Bewertung
            String bewertung;
            if (versuche <= 5) {
                bewertung = "Prima, schnell erraten!";
            } else if (versuche <= 10) {
                bewertung = "Gut gemacht!";
            } else if (versuche <= 20) {
                bewertung = "Ganz okay, aber da geht noch was!";
            } else {
                bewertung = "Sie haben sehr lange zum Erraten gebraucht!";
            }

            System.out.println("\nDu hast gewonnen!");
            System.out.println("Versuche: " + versuche);
            System.out.println("Zeit: " + (benoetigteZeit / 1000.0) + " Sekunden");
            System.out.println("Bewertung: " + bewertung);

            // Highscore aktualisieren
            if (versuche < highscore) {
                highscore = versuche;
                System.out.println("Neuer Highscore (wenigste Versuche)!");
            }

            // Bestzeit aktualisieren
            if (benoetigteZeit < bestzeit) {
                bestzeit = benoetigteZeit;
                System.out.println("Neue Bestzeit!");
            }

            System.out.println("\nAktueller Highscore: " + highscore + " Versuche");
            System.out.println("Beste Zeit: " + (bestzeit / 1000.0) + " Sekunden");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(String.valueOf(highscore));
                writer.newLine();
                writer.write(String.valueOf(bestzeit));
            } catch (IOException e) {
                System.out.println("Fehler beim Speichern der Datei!");
            }

            // Weiterspielen?
            System.out.print("\nMöchtest du nochmal spielen? (j/n): ");
            String antwort = scanner.next();

            if (!antwort.equalsIgnoreCase("j")) {
                weiterspielen = false;
            }
        }

        System.out.println("\nDanke fürs Spielen! Bis zum nächsten Mal.");
        scanner.close();
    }
}
