package Encapsulation;

public class Application {
    public static void main(String[] args) {
        ContBancar maib = new ContBancar();

        maib.setNumarCont(1223123123);
        maib.setSold(1329.34f);

        System.out.println(maib.getNumarCont());
        System.out.println(maib.getSold());

    }
}
