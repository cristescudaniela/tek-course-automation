package Polymorphism;

public class Application {
    public static void main(String[] args) {
        Animal mars = new Pisica();
        mars.emiteSunet();

        Animal charlie = new Caine();
        charlie.emiteSunet();
    }
}
