import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartamentCreator {
    public static void main(String[] args) {
        // Crear apartamentos manualmente
        Apartament apt1 = new Apartament(
                "Calle Mayor 123", 750.0, 3,
                "Piso céntrico y luminoso", "Juan Pérez", true);

        Apartament apt2 = new Apartament(
                "Avda. Libertad 45", 950.0, 4,
                "Amplio apartamento familiar", "Ana Gómez", false);

        Apartament apt3 = new Apartament(
                "Plaza España 9", 620.0, 2,
                "Apartamento acogedor con vistas", "Luis Torres", true);

        Apartament apt4 = new Apartament(
                "Calle del Sol 56", 1100.0, 5,
                "Ático con terraza", "Marta Ruiz", true);

        // Guardar en una lista
        List<Apartament> apartmentList = new ArrayList<>();
        apartmentList.add(apt1);
        apartmentList.add(apt2);
        apartmentList.add(apt3);
        apartmentList.add(apt4);

        // Crear objeto Gson con formato bonito (pretty printing)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Ruta del archivo donde se guardarán los apartamentos
        String filePath = "Sol-Lab/src/main/resources/new_apartments.json";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Convertir la lista a JSON y escribirla en el archivo
            gson.toJson(apartmentList, writer);
            System.out.println("Archivo JSON generado correctamente en: " + filePath);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo JSON: " + e.getMessage());
        }
    }
}


