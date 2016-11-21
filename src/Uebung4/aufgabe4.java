package Uebung4;

import java.util.Scanner;

public class aufgabe4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if ((input % 400) == 0 ) System.out.println(input + " ist ein Schaltjahr");
        else if ((input % 100) == 0) System.out.println(input + " it KEIN Schaltjahr");
        else if ((input % 4) == 0) System.out.println(input + " ist ein Schaltjahr");
        else System.out.println(input + " ist kein Schaltjahr");
    }
}
