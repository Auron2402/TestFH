package Uebung9;

import java.util.ArrayList;
import java.util.Random;

public class Aufgabe1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; array.size() < 6; i++) {
            int random = r.nextInt(49) + 1;
            if (array.contains(random)) i--;
            else array.add(random);
        }

        for (int i = 0; i < array.size(); i++) {
            int min = Integer.MAX_VALUE;
            int index = i;
            int speicher;
            for (int k = 0; array.size() - i - k > 0; k++) {
                if (min > array.get(i + k)) {
                    min = array.get(i + k);
                    index = i + k;
                }
            }
            speicher = array.get(i);
            array.set(i, min);
            array.set(index, speicher);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + array.get(i));
        }

    }
}
