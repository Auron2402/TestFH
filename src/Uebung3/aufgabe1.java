package Uebung3;

import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ganzzahl;
        System.out.print("Ganze Zahl eingeben");
        ganzzahl = scan.nextInt();
        int rest;
        rest = ganzzahl % 7;
        if (rest == 0) {
            System.out.println(ganzzahl + " kann ganzzahlig durch 7 geteilt werden");
        } else {
            System.out.println(ganzzahl + " kann nicht ganzzahlig durch 7 geteilt werden da rest = " + rest);
        }
    }
}
/*
    eingabe     mod         ergebnis
    +           +           +
    +           -           +
    -           +           -
    -           -           -

 */