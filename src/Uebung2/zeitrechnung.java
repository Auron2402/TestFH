package Uebung2;


import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Auron on 24.10.2016.
 */
public class zeitrechnung {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));


        int std = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);

        int secsincemidnight =  ((std * 60 * 60) + (min * 60) + sec);


        System.out.println("Sekunden seit mitternacht: " + secsincemidnight);
        System.out.println("Sekunden bis mitternach: " + (24*60*60-secsincemidnight));
        System.out.println("der tag ist zu " + 100.0/(24*60*60)*secsincemidnight + " % vorbei");





    }
}
