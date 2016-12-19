package Uebung10;

public class Auto {
    private String Marke;
    private int Hubraum;
    private String Farbe;
    private boolean Heckantrieb;

    public Auto(String marke, int hubraum, String farbe, boolean heckantrieb) {
        Marke = marke;
        if (hubraum > 0) Hubraum = hubraum;
        else Hubraum = 1600;
        Farbe = farbe;
        Heckantrieb = heckantrieb;
    }

    public void setMarke(String marke) {
        Marke = marke;
    }

    public String getMarke() {
        return Marke;
    }

    public int getHubraum() {
        return Hubraum;
    }

    public String getFarbe() {
        return Farbe;
    }

    public boolean isHeckantrieb() {
        return Heckantrieb;
    }

    public void setHubraum(int hubraum) {
        if (hubraum > 0) Hubraum = hubraum;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }

    public void setHeckantrieb(boolean heckantrieb) {
        Heckantrieb = heckantrieb;
    }

    public static void main() {

    }
}
