package Uebung10;

public class Speisekarte {
    private String name;
    private int durchmesser;
    private int preis;

    public Speisekarte(String name, int durchmesser, int preis) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }
}