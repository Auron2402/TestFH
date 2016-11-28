package Uebung7;

import java.util.Scanner;

/**
 * Created by Auron on 28.11.2016.
 */


public class Aufgabe2 {
    public static double round(double scanner) {
        scanner = scanner * 10;
        if ((scanner % 10) >= 5) {
            scanner = scanner + (10 - (scanner % 10));
        } else {
            scanner = scanner - (scanner % 10);
        }
        scanner = scanner / 10;
        return scanner;
    }

    public static double round2(double scanner, int nachkomma) {

        int i = nachkomma;
        while (i > 0) {
            scanner = scanner * 10;
            i--;
        }
        scanner = round(scanner);
        i = nachkomma;
        while (i > 0) {
            scanner = scanner / 10;
            i--;
        }
        return scanner;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double eingabe = scan.nextDouble();
        int nachkomma = scan.nextInt();
        System.out.println(round2(eingabe, nachkomma));
    }
}
