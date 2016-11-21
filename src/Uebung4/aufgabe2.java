package Uebung4;

import java.util.Scanner;

/**
 * Created by Auron on 07.11.2016.
 */
public class aufgabe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean check = true;

        int hour = scan.nextInt();
        int min = scan.nextInt();
        int sec = scan.nextInt();

        if (hour <= 24 && hour >= 0) System.out.println("Stunden gültig");
        else {
            check = false;
            System.out.println("Stunden ungültig");
        }

        if (min <= 60 && min >= 0) System.out.println("Minuten gültig");
        else {
            check = false;
            System.out.println("Minuten ungültig");
        }

        if (sec <= 60 && min >= 0) System.out.println("Sekunden gültig");
        else {
            check = false;
            System.out.println("Sekunden ungültig");
        }
        if (check == false) System.out.println("Ergibt keine gültige Uhrzeit");
        else System.out.println(hour + ":" + min + ":" + sec);

    }
}

