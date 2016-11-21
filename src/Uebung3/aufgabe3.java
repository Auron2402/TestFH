package Uebung3;

import java.util.Scanner;

public class aufgabe3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char eingabe = scan.nextLine().charAt(0);
        if (Character.isUpperCase(eingabe)) {
            System.out.println("Großbuchstabe");
            if (eingabe == '0' || eingabe == '1') System.out.println("binäre Ziffer");
            if (eingabe <= '7' && eingabe >= '0') System.out.println("oktale Ziffer");
            if (eingabe <= '9' && eingabe >= '0' || eingabe >= 'A' && eingabe <= 'F' || eingabe >= 'a' && eingabe <= 'f')
                System.out.println("hexadezimale Ziffer");
        } else {

            if (eingabe == '0' || eingabe == '1') System.out.println("binäre Ziffer");
            if (eingabe <= '7' && eingabe >= '0') System.out.println("oktale Ziffer");
            if (eingabe <= '9' && eingabe >= '0' || eingabe >= 'A' && eingabe <= 'F' || eingabe >= 'a' && eingabe <= 'f')
                System.out.println("hexadezimale Ziffer");
            else System.out.println("Unbekannt");
        }

    }
}
