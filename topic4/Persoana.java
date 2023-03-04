package topic4;

public class Persoana {
    String nume;
    int virsta;

    public Persoana(String nume, int virsta) {
        this.nume = nume;
        this.virsta = virsta;
    }

    public void categorieDeVirsta() {
        if (virsta <= 14) {
            System.out.println("Copil");
        }
        if (14 < virsta && virsta <= 18) {
            System.out.println("Adolescent");
        }
        if (18 < virsta && virsta <= 65) {
            System.out.println("Matur");
        }
        if (65 < virsta && virsta <= 101) {
            System.out.println("Virstnic");
        }
    }
}
