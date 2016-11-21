package Uebung2;

/**
 * Created by Auron on 24.10.2016.
 */
public class Tausch
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println(x);
        System.out.println(y);
        //Tausch

        int z = 0;
        z = x;
        x = y;
        y = z;

        //Nach dem Tausch
        System.out.println(x);
        System.out.println(y);
    }
}
