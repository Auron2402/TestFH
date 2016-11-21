package Uebung5;

public class aufgabe2 {
    public static void main(String[] args){
        int k = 1;
        double summ = 0;
        double rechnung;
        double ausgabe;
        do {
            rechnung = (1.0/(k*k));
            k++;
            summ = summ + rechnung;
            ausgabe = 6 * summ;
            System.out.println(ausgabe);
        }while (rechnung > 0.00001 );
        }
    }

