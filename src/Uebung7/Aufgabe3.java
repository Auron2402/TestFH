package Uebung7;

import java.util.Scanner;

public class Aufgabe3 {
    public static double fakt(int eingabe) {
        double ergebnis = 1.;
        for (; eingabe > 0; eingabe--) {
            ergebnis = ergebnis * eingabe;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eingabe = scan.nextInt();
        double ergebnis = fakt(eingabe);
        System.out.println(ergebnis);
    }
}
