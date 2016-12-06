package Vorlseungen;

/**
 * Created by Auron on 06.12.2016.
 */
public class Student {
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setMatrnr(int matrnr) {
        this.matrnr = matrnr;
    }

    public void setAdditionals(String additionals) {
        this.additionals = additionals;
    }

    public String getVorname() {

        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getMatrnr() {
        return matrnr;
    }

    public String getAdditionals() {
        return additionals;
    }

    private String vorname;
    private String nachname;
    private int matrnr;
    private String additionals;

    public Student(String vorname, String nachname, int matrnr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrnr = matrnr;
    }


}


class Main {
    public static void main(String[] args) {
        Student a = new Student("Christian", "Neuerer", 123456);
        Student b = new Student("Jonas", "Burger", 654321);
        Student c = new Student("Achim", "Winter", 321654);
    }
}

