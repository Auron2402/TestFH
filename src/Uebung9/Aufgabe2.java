package Uebung9;

/**
 * Created by Auron on 12.12.2016.
 */
public class Aufgabe2 {
    public static String spielen(String input) {
        char[] array = input.toCharArray();
        String ausgabe = "";
        for (int i = 0; i < array.length; i++) {
            if (charcheck(array[i])) {
                ausgabe += String.valueOf(array[i]);
                ausgabe += "b";
                ausgabe += String.valueOf(array[i]);
            } else ausgabe += String.valueOf(array[i]);
        }
        return ausgabe;
    }

    public static boolean charcheck(char input) {
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') return true;
        else return false;
    }

    public static void main(String[] args) {
        String eingabe = "spiel mit mir";
        System.out.print(spielen(eingabe));
    }
}
