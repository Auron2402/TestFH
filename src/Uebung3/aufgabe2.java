package Uebung3;

import java.util.Scanner;

public class aufgabe2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double preis;
        double durchmesser;

        System.out.println("Durchmesser von Pizza 1 eingeben (cm)");
        durchmesser = scan.nextDouble();
        System.out.println("Preis von Pizza 1 eingeben");
        preis = scan.nextDouble();

        double preis2;
        double durchmesser2;

        System.out.println("Durchmesser von Pizza 2 eingeben (cm)");
        durchmesser2 = scan.nextDouble();
        System.out.println("Preis von Pizza 2 eingeben");
        preis2 = scan.nextDouble();

        double preisprocm1 = (Math.PI*(durchmesser/2)*(durchmesser/2))*preis;
        double preisprocm2 = (Math.PI*(durchmesser2/2)*(durchmesser2/2))*preis2;

        if (preisprocm1 == preisprocm2) System.out.println("Preis pro cm ist gleich");
        else if (preisprocm1 > preisprocm2) System.out.println("Pizza 2 ist preiswerter");
        else System.out.println("pizza 1 ist preiswerter");
    }
}
