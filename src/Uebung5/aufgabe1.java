package Uebung5;

import java.util.Scanner;
public class aufgabe1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt();
        for( int i = 1; i <= sec; i++){
            double strecke = 0.5*9.81*i*i;
            System.out.println(strecke);
            Thread.sleep(1000);
        }
    }
}
