package Uebung4;

import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * Created by Auron on 07.11.2016.
 */
public class aufgabe3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (input.equals("ff")) System.out.println("0");
        else if (input.equals("ft")) System.out.println("1");
        else if (input.equals("tf")) System.out.println("2");
        else if (input.equals("tt")) System.out.println("3");
        else System.out.println("Keine gültige Eingabe");

    }
}
