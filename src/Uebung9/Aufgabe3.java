package Uebung9;

/**
 * Created by Auron on 12.12.2016.
 */
public class Aufgabe3 {
    public static String main(String[] args) {
        String str = args.toString();
        String[] split = str.split(" ");
        double zahl1 = Integer.parseInt(split[0]);
        double zahl2 = Integer.parseInt(split[1]);
        double ergebniss = zahl1 * zahl2;
        if (split.length == 2) return String.valueOf(ergebniss);
        else return "eine aussagekräftige Fehlermeldung";
    }
}
