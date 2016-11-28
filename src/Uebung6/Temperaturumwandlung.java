package Uebung6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Temperaturumwandlung {
    public static void main (String[] Args) {
        System.out.println("Fahrenheit " + "\t" + "Celsius");
        for(int fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {
            float celsius = (5 / 9f) * (fahrenheit - 32f);
            NumberFormat numberFormat = new DecimalFormat("0.0");
            numberFormat.setRoundingMode(RoundingMode.DOWN);
            System.out.println(fahrenheit + "\t\t\t" + numberFormat.format(celsius));
        }
    }
}
