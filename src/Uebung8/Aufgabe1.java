package Uebung8;

import java.util.Scanner;

public class Aufgabe1 {
    public static int exponent(int x, int n, int ergebnis) {
        if (n == 0) return 1;
        else {
            n--;
            ergebnis = x * exponent(x, n, ergebnis);
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int ergebnis = exponent(x, n, 1);
        System.out.println(ergebnis);
    }
}
