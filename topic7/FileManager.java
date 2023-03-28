package topic7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    static void scriereaInformatieTextInFisier(String caleaCatreFisier, String date) {

        try {
            File file = new File(caleaCatreFisier);
            if (file.createNewFile()) {
                System.out.println("New File is created");
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(caleaCatreFisier)) {
            fileWriter.write(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void alipireaInformatieiLaFisier(String caleaCatreFisier, String date) {
        try (FileWriter fileWriter = new FileWriter(caleaCatreFisier, true)) {
            fileWriter.append(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String citireDateDinFisier(String caleaCatreFisier) {
        char[] array = new char[45];
        try {
            FileReader fileReader = new FileReader(caleaCatreFisier);
            fileReader.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            fileReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return "";
    }
}
