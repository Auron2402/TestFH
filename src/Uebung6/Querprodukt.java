package Uebung6;

import java.util.Scanner;

/**
 * Created by christian on 21.11.16.
 */
public class Querprodukt {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int eingabe;
        boolean bool = true;
        do{
            System.out.println("Geben Sie bitte eine Zahl ein: ");
            eingabe = scan.nextInt();
            if(eingabe < 1000000 && eingabe > 0){bool = true;}
            else{System.out.println("Fehler - zahl ungültig");
                 bool = false;}
        }
        while(bool == false);

        int ergebnis = 1;
        do {
            int zahl = eingabe % 10;
            ergebnis = ergebnis * zahl;
            eingabe = eingabe / 10;

        }while(eingabe > 0);
        System.out.println("Das Querprodukt ist: " + ergebnis);
        }

    }

