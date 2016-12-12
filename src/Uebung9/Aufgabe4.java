package Uebung9;

import java.util.Scanner;

/**
 * Created by Auron on 12.12.2016.
 */
public class Aufgabe4 {

    public static double pow(double x, int x2) {
        for (; x2 > 0; x2--) {
            x = x * x;
        }
        return x;
    }

    public static double nenner(double k) {
        double ergebnis = 1;
        for (int i = 2 * (int) k + 1; i >= 1; i--) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }

    public static double sin(double x) {
        double sum = 0;
        int l;
        for (long k = 0; k < 10; k++) {
            if (k % 2 == 0) {
                l = 1;
            } else l = -1;

            sum = sum + l * (pow(x, 2 * (int) k + 1) / nenner(k));
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double eingabe = scan.nextDouble();
        System.out.println(sin(eingabe));
    }
}
