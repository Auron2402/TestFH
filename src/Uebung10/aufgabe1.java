package Uebung10;

public class aufgabe1 {
    public static void main(String[] args) {
        Auto Chris = new Auto("BMW", 1000, "Schwarz", true);
        Auto Armin = new Auto("Audi", 1500, "Schwarz", false);
        Auto Jonas = new Auto("Gammel", 500, "Weiß", false);


        double maxhubraum = Math.max(Math.max(Chris.getHubraum(), Armin.getHubraum()),
                Math.max(Armin.getHubraum(), Jonas.getHubraum()));

        System.out.println(maxhubraum);

    }
}