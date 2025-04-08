import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) {
        // Crear algunos apartamentos
        Apartment apartment1 = new Apartment("Calle Mayor 123", 1200.50, 3, "Apartamento céntrico con vistas", "Juan Pérez", true);
        Apartment apartment2 = new Apartment("Avenida Libertad 45", 950.75, 2, "Apartamento luminoso y reformado", "Ana García", false);
        Apartment apartment3 = new Apartment("Plaza España 7", 1500.00, 4, "Amplio piso con terraza", "Carlos Rodríguez", true);
        Apartment apartment4 = new Apartment("Calle Nueva 28", 850.25, 1, "Estudio moderno en zona tranquila", "Laura Martínez", true);

        // Crear una lista y añadir los apartamentos
        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.add(apartment1);
        apartmentList.add(apartment2);
        apartmentList.add(apartment3);
        apartmentList.add(apartment4);

        // Mostrar los apartamentos creados
        System.out.println("Apartamentos creados:");
        for (Apartment apartment : apartmentList) {
            System.out.println(apartment);
        }

        // Iteración 5: Generar JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Convertir la lista de apartamentos a JSON
        String json = gson.toJson(apartmentList);

        // Escribir el JSON en un archivo
        try (FileWriter writer = new FileWriter("solLab/src/main/resources/new_apartments.json")) {
            writer.write(json);
            System.out.println("\nJSON generado y guardado correctamente en src/main/resources/new_apartments.json");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}