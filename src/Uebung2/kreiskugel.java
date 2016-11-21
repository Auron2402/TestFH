package Uebung2;

import java.util.Scanner;

/**
 * Created by Auron on 24.10.2016.
 */
public class kreiskugel {
    public static void main(String[] args) {

        float r;

        Scanner in = new Scanner(System.in);

        System.out.println("Radius eingeben:");
        r = in.nextFloat();
        System.out.println("Kreisumfang: " + "2*PI*r" + " = " + 2 * Math.PI * r);
        System.out.println("Kreisfläche: " + "PI*r²" + " = " + Math.PI * r * r);
        System.out.println("Kugelvolumen: " + "(4/3)*PI*r³" + " = " + (4/3.0) * Math.PI * r * r * r);

    }

}
