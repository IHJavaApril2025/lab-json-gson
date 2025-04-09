import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApartamentManager {

    public static void main(String[] args) throws Exception {
        // crear el builder de Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Leer el archivo JSON
        Reader reader = new FileReader("laboratorio-maven-gson/src/main/resources/apartments.json");

        // Convertir el JSON a un array de objetos Apartment
        Apartament[] apartmentsArray = gson.fromJson(reader, Apartament[].class);

        // Crear un ArrayList y añadir los apartamentos
        List<Apartament> apartments = new ArrayList<>();
        Collections.addAll(apartments, apartmentsArray);

        // Ver un apartamento, para comprobar que funciona
        System.out.println(apartments.get(0).toString());

        // Cerrar el reader
        reader.close();
    }
}
