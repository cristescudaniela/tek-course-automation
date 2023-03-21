package topic7;

public class Main {

    public static void main(String[] args) {
        String adresa = "C:\\Users\\bugao\\OneDrive\\Desktop\\Practice\\testing.txt";
        FileManager.scriereaInformatieTextInFisier(adresa, "Hello World!" );
        FileManager.alipireaInformatieiLaFisier(adresa, "\nHow are you?");
        FileManager.citireDateDinFisier(adresa);
    }
}
