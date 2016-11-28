package Uebung7;

import java.util.Scanner;

public class Aufgabe4 {
    public static void stern(int anzahl) {
        for (; anzahl > 0; anzahl--) {
            System.out.print("* ");
        }
    }

    public static void leer(int anzahl) {
        for (; anzahl > 0; anzahl--) {
            System.out.print(" ");
        }
    }

    public static void ende() {
        System.out.println(" ");
    }

    public static void dreieck(int zeilen) {

        for (int sternzahl = 1; zeilen > 0; zeilen--) {
            leer(zeilen);
            stern(sternzahl);
            ende();
            sternzahl++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zeilen = scan.nextInt();
        dreieck(zeilen);
    }
}
