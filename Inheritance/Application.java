package Inheritance;

public class Application {
    public static void main(String[] args) {
        Masina auris = new Masina();
        auris.culoare = "gray";
        auris.nrRoti = 4;
        auris.marca = "Toyota Auris";
        auris.afiseazaDetaliiVehicul();

        Vehicul toyota = new Vehicul();
        toyota.culoare = "Rosu";
        toyota.nrRoti = 4;
        toyota.afiseazaDetaliiVehicul();

    }
}
