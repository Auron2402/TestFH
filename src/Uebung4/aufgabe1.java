package Uebung4;


import java.util.Scanner;

public class aufgabe1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if (input >= 5000000 && input < 5200000) System.out.println("Gültige matrnr");
        else if (input >= 6100000 && input < 6200000) System.out.println("Gültige matrnr");
        else System.out.println("Ungültige matrnr");
    }
}
