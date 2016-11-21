package Uebung2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Auron on 24.10.2016.
 */
public class gleichung {
    public static void main(String[] args) throws IOException {
        double p;
        double q;

        Scanner in = new Scanner(System.in);

        System.out.println("p eingeben");
        p = in.nextFloat();

        System.out.println("q eingeben");
        q = in.nextFloat();

        System.out.println("+ Ergebnis: " + ((-p/2)+Math.sqrt(Math.pow(p/2, 2)-q)));

        System.out.println("- Ergebnis: " + ((-p/2)-Math.sqrt(Math.pow(p/2, 2)-q)));

    }
}
