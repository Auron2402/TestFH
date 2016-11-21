package Uebung5;

import java.util.Scanner;

public class aufgabe4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        boolean bool = true;
        if (value <= 2) {
            bool = (value == 2);
        }
        for (long i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                bool = false;
            }
        }


        if (bool == true) System.out.println("Primzahl");
        else System.out.println("keine primzahl");
    }
}
