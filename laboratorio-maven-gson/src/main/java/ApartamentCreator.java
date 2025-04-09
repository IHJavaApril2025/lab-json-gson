import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartamentCreator {

    public static void main(String[] args) {
        // Apartamentos creados manualmente

        Apartament apt1 = new Apartament(
                "Calle Balcanes", 820.0, 3,
                "Piso amplio y céntrico", "Antonio Alonso", true);

        Apartament apt2 = new Apartament(
                "Avenida La Paz 84", 1150.0, 4,
                "Amplio piso y luminoso", "Adriana López", false);

        Apartament apt3 = new Apartament(
                "Plaza del Sol 17", 710.0, 2,
                "Apartamento cuco con vistas", "Andrés Benítez", true);

        Apartament apt4 = new Apartament(
                "Calle de la Palma 7", 2100.0, 5,
                "Dúplex con vistas", "Susana Ruiz", true);

        // Guardar en una lista
        List<Apartament> apartmentList = new ArrayList<>();
        apartmentList.add(apt1);
        apartmentList.add(apt2);
        apartmentList.add(apt3);
        apartmentList.add(apt4);

        // Crear objeto Gson con formato bonito (pretty printing)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Ruta del archivo donde se guardarán los apartamentos
        String filePath = "laboratorio-maven-gson/src/main/resources/new_apartments.json";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Convertir la lista a JSON y escribirla en el archivo
            gson.toJson(apartmentList, writer);
            System.out.println("Archivo JSON generado correctamente en: " + filePath);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo JSON: " + e.getMessage());
        }
    }
}
