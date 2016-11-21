package Uebung6;

import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        double a = scan.nextDouble();
        System.out.println("potenz ausgeben");
        int b = scan.nextInt();
        double c = a;
        if(b==0){
            System.out.println("1");
        }
        else if(b > 0) {

            while (b > 1) {
                c = a * c;
                b = b - 1;

            }
            System.out.println(c);
        }
        else if (b < 0) {
            b = b * (-1);
            while (b > 1) {
                c = c * a;
                b--;
            }
            c = 1 / c;
            System.out.println(c);
        }





}
}
