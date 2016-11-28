package Uebung7;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double flaeche = 0;
        int counter = 0;
        int r = 1;

        while (counter < n) {
            flaeche = flaeche + r / n * Math.sqrt((r * r) - ((counter / n) * (counter / n)));
            counter++;
        }

        System.out.println(4 * flaeche);
    }
}
