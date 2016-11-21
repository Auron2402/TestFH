package Uebung3;

public class aufgabe4 {
    public static void main(String[] args){


        double wurf = (Math.random() * 6) + 1;
        int intwurf = (int) wurf;
        if (intwurf == 1) System.out.println("Eins gewürfelt");
        if (intwurf == 2) System.out.println("Zwei gewürfelt");
        if (intwurf == 3) System.out.println("Drei gewürfelt");
        if (intwurf == 4) System.out.println("Vier gewürfelt");
        if (intwurf == 5) System.out.println("Fünf gewürfelt");
        if (intwurf == 6) System.out.println("Sechs gewürfelt");
    }
}
