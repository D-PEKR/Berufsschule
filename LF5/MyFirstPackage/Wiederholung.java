package MyFirstPackage;

import java.util.Random;
import java.util.Scanner;

public class Wiederholung{

    public static void main(String[] args) {

        // Variablen deklarieren

        // Ganzzahlen
        int g1 = 0;
        int g2 = 0;
        int gErgebnis = 0;

        // Kommazahlen
        double k1 = 0.0;
        double k2 = 0.0;
        double kErgebnis = 0.0;

        // Wahrheitswerte
        boolean w1 = false;
        boolean w2 = false;

        // Berechnungen mit Ganzzahlen

        g1 = 523;
        g2 = 114;

        gErgebnis = g1 + g2;
        System.out.println("Summe (523 + 114) = " + gErgebnis);

        gErgebnis = g1 * g2;
        System.out.println("Produkt (523 * 114) = " + gErgebnis);

        // Berechnungen mit Kommazahlen

        k1 = 2.75;
        k2 = 7.2;

        kErgebnis = k1 + k2;
        System.out.println("Summe (2.75 + 7.2) = " + kErgebnis);

        kErgebnis = k1 * k2;
        System.out.println("Produkt (2.75 * 7.2) = " + kErgebnis);


        // Schleife: Summe 1 bis 100

        gErgebnis = 0; // zurücksetzen

        for (int i = 1; i <= 100; i++) {
            gErgebnis += i;
        }

        System.out.println("Summe 1 bis 100 = " + gErgebnis);

        // Schleife: Summe der geraden Zahlen 1–100

        gErgebnis = 0; // zurücksetzen

        for (int i = 2; i <= 100; i += 2) {
            gErgebnis += i;
        }

        System.out.println("Summe der geraden Zahlen 1–100 = " + gErgebnis);

        // Zufallszahl 0–100 erzeugen

        int zufall = (int) (Math.random() * 101);
        System.out.println("Zufallszahl: " + zufall);

        if (zufall == 42) {
            w1 = true;
        } else {
            w1 = false;
        }

        System.out.println("Ist die Zufallszahl 42? " + w1);

        // 100 Zufallszahlen (0–50) aufsummieren

        gErgebnis = 0; // zurücksetzen

        for (int i = 0; i < 100; i++) {
            gErgebnis += (int) (Math.random() * 51);
        }

        System.out.println("Summe der 100 Zufallszahlen = " + gErgebnis);

        if (gErgebnis > 2000) {
            w2 = true;
        } else {
            w2 = false;
        }

        System.out.println("Ist die Summe > 2000? " + w2);



        //--------------------

        Scanner scanner = new Scanner(System.in);

        // 1) Texte ausgeben und einlesen

        // a) Ausgabe von Vorname, Nachname und Email in drei Zeilen
        System.out.println("Max");
        System.out.println("Mustermann");
        System.out.println("max@beispiel.de");

        // b) Einlesen von Vor- und Nachname und Ausgabe in der Form „Vorname, Nachname“
        System.out.print("Vorname: ");
        String vorname = scanner.nextLine();

        System.out.print("Nachname: ");
        String nachname = scanner.nextLine();

        System.out.println(vorname + ", " + nachname);


        // 2) Berechnungen

        // a) Summe von 17 und 4
        int summe2a = 17 + 4;
        System.out.println(summe2a);

        // b) Zwei Zahlen einlesen und Summe ausgeben
        System.out.print("Zahl a: ");
        int a = scanner.nextInt();

        System.out.print("Zahl b: ");
        int b = scanner.nextInt();

        int summe2b = a + b;
        System.out.println("Die Summe von " + a + " und " + b + " ist " + summe2b + ".");


        // 3) for-, while- und do-while-Schleifen

        // a) Quadratzahlen von 1 bis 100 aufaddieren – for-Schleife
        int summe3afor = 0;
        for (int i = 1; i <= 100; i++) {
            summe3afor += i * i;
        }
        System.out.println(summe3afor);

        // while-Schleife
        int i = 1;
        int summe3awhile = 0;

        while (i <= 100) {
            summe3awhile += i * i;
            i++;
        }
        System.out.println(summe3awhile);

        // do-while-Schleife
        i = 1;
        int summe3adowhile = 0;

        do {
            summe3adowhile += i * i;
            i++;
        } while (i <= 100);

        System.out.println(summe3adowhile);

        // b) Abbruchbedingungen:
        // for = vor jedem Durchlauf
        // while = vor jedem Durchlauf
        // do-while = nach jedem Durchlauf (läuft mindestens einmal)


        // 4) Zufallszahlen erzeugen

        // a) Beliebige Zufallszahl
        int zufall2 = scanner.nextInt();
        System.out.println(zufall);

        // b) Münzwurf (0 oder 1)
        int muenze = scanner.nextInt(2);
        System.out.println(muenze);

        // c) Würfelwurf (1 bis 6)
        int wuerfel = scanner.nextInt(6) + 1;
        System.out.println(wuerfel);


        // 5) Einfache Datentypen (boolean)

        // a) Erklärung boolean
        /*
         * Ein boolean kann nur zwei Werte haben:
         * true (wahr)
         * false (falsch)
         * Er wird benutzt für Bedingungen, z.B. in Schleifen und if-Abfragen.
         */

        // b) Summe aller durch 3 teilbaren Zahlen von 1 bis 1000 (mit boolean-Abbruch)
        i = 1;
        int summe5b = 0;
        boolean weiter = true;

        do {
            if (i % 3 == 0) {
                summe5b += i;
            }

            i++;

            if (i > 1000) {
                weiter = false;
            }

        } while (weiter);

        System.out.println(summe5b);


        // 6) Vertauschen zweier Werte

        // a) Mit Hilfsvariable
        int a6a = scanner.nextInt();
        int b6a = scanner.nextInt();

        int temp = a6a;
        a6a = b6a;
        b6a = temp;

        System.out.println("a = " + a6a);
        System.out.println("b = " + b6a);

        // b) Ohne Hilfsvariable
        a6a = a6a + b6a;
        b6a = a6a - b6a;
        a6a = a6a - b6a;


        // 7) Währungsumrechnung

        // a) DM → Euro für festen Wert
        double dm7a = 9876.54;
        double euro7a = dm7a / 1.95583;
        System.out.println(euro7a);

        // b) DM → Euro für eingegebenen Wert
        System.out.print("DM Betrag: ");
        double dm7b = scanner.nextDouble();

        double euro7b = dm7b / 1.95583;
        System.out.println("Euro: " + euro7b);
    }
}
