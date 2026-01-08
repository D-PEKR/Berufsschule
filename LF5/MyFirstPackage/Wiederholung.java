package MyFirstPackage;

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
    }
}
