import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) {
        try {
            // Obtener el archivo JSON como recurso
            InputStream inputStream = ApartmentManager.class.getClassLoader().getResourceAsStream("apartments.json");

            if (inputStream == null) {
                System.err.println("No se pudo encontrar el archivo apartments.json");
                return;
            }

            // Crear un Reader para leer el archivo
            Reader reader = new InputStreamReader(inputStream);

            // Crear una instancia de Gson
            Gson gson = new Gson();

            // Definir el tipo de la lista de apartamentos
            Type apartmentListType = new TypeToken<ArrayList<Apartment>>(){}.getType();

            // Convertir el JSON a una lista de objetos Apartment
            List<Apartment> apartments = gson.fromJson(reader, apartmentListType);

            // Cerrar el reader
            reader.close();

            // Mostrar la lista de apartamentos
            System.out.println("Apartamentos cargados desde el JSON:");
            for (Apartment apartment : apartments) {
                System.out.println(apartment);
            }

            // Alternativamente, puedes crear una nueva lista y usar Collections.addAll()
            List<Apartment> newApartmentsList = new ArrayList<>();
            Collections.addAll(newApartmentsList, apartments.toArray(new Apartment[0]));

            System.out.println("\nApartamentos en la nueva lista:");
            for (Apartment apartment : newApartmentsList) {
                System.out.println(apartment);
            }

        } catch (Exception e) {
            System.err.println("Error al leer el archivo JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
