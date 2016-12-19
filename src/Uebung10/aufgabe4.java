package Uebung10;

public class aufgabe4 {
    public static double rechnung(String eingabe) {
        String[] array = eingabe.split(" ");
        double[] zahlen = new double[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            zahlen[i] = Double.parseDouble(array[i]);
        }
        char rechnung = array[array.length - 1].charAt(0);
        double ergebnis = 0;
        for (double z : zahlen
                ) {
            if (rechnung == '+') ergebnis += z;
            if (rechnung == '-') ergebnis -= z;
        }
        return ergebnis;
    }

    public static void main(String[] args) {

    }
}
