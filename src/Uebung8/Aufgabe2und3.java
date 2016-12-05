package Uebung8;

import java.util.Scanner;

public class Aufgabe2und3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("anzahl?");
        int anzahl = scan.nextInt();
        if (anzahl < 1) System.out.println("Muss > 0 sein");
        else {
            double[] array = new double[anzahl];
            for (int i = 0; anzahl > 0; anzahl--) {
                System.out.print(i + 1 + ". wert");
                array[i] = scan.nextDouble();
                i++;
            }
            double max = 0;
            for (double v : array) {
                if (v > max) max = v;
            }
            double min = Double.MAX_VALUE;
            for (double v : array) {
                if (v < min) min = v;
            }

            double mittel = 0;
            for (double v : array) {
                mittel = mittel + v;
            }
            mittel = mittel / array.length;

            double abweichung = 0;
            for (double v : array) {
                abweichung = abweichung + Math.pow(v - mittel, 2);
            }
            abweichung = abweichung / array.length;

            System.out.println("min: " + min);
            System.out.println("max: " + max);
            System.out.println("mittel: " + mittel);
            System.out.println("abweichung: " + Math.sqrt(abweichung));
        }
    }
}
