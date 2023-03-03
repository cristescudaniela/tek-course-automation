package topic2;

public class Main {
    public static void main(String[] args) {
        Persoana vio = new Persoana();
        vio.nume = "Alina";
        vio.prenume = "Ursu";
        vio.gen = 'F';
        vio.virsta = 30;
        vio.setGreutate(56f);
        System.out.println("Numele este " + vio.nume);
        System.out.println("Prenumele este " + vio.prenume);
        System.out.println("Genul este " + vio.gen);
        System.out.println("Are " + vio.virsta + " ani");
        System.out.println("Greutate " + vio.getGreutate() + " kg");

    }
}
