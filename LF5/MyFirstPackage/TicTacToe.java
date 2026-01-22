package MyFirstPackage;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        boolean[][] x = new boolean[3][3];
        boolean[][] o = new boolean[3][3];

        Scanner sc = new Scanner(System.in);
        boolean spielerX = true;

        while (true) {
            System.out.println("Spieler " + (spielerX ? "X" : "O") + " ist am Zug.");
            System.out.print("Zeile (0-2): ");
            int z = sc.nextInt();
            System.out.print("Spalte (0-2): ");
            int s = sc.nextInt();

            boolean[][] feld = spielerX ? x : o;

            if (setzeZug(feld, z, s)) {
                if (hatGewonnen(feld)) {
                    System.out.println("Spieler " + (spielerX ? "X" : "O") + " hat gewonnen!");
                    break;
                }
                spielerX = !spielerX;
            } else {
                System.out.println("Feld bereits belegt!");
            }
        }
    }

    public static boolean hatGewonnen(boolean[][] f) {
        // Reihen
        for (int i = 0; i < 3; i++) {
            if (f[i][0] && f[i][1] && f[i][2]) return true;
        }

        // Spalten
        for (int i = 0; i < 3; i++) {
            if (f[0][i] && f[1][i] && f[2][i]) return true;
        }

        // Diagonalen
        if (f[0][0] && f[1][1] && f[2][2]) return true;
        if (f[0][2] && f[1][1] && f[2][0]) return true;

        return false;
    }

    public static boolean setzeZug(boolean[][] feld, int zeile, int spalte) {
        if (!feld[zeile][spalte]) {
            feld[zeile][spalte] = true;
            return true;
        }
        return false;
    }
}