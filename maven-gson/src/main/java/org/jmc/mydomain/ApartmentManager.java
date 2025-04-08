package org.jmc.mydomain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) throws IOException {
        // inicializamos el gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // localizamos el archivo que queremos leer
        String fileLocation = "./maven-gson/src/main/resources/apartments.json";

        Reader reader = new FileReader(fileLocation);

        // Si tenemos un array de apartments en el JSON:
        JsonArray usersArrayJson = gson.fromJson(reader, JsonArray.class);

        System.out.println(usersArrayJson);

        System.out.println(usersArrayJson);

        List<Apartment> apartmentList = new ArrayList<>();

        for (JsonElement apartmentElement : usersArrayJson) {
            Apartment apartment = gson.fromJson(apartmentElement, Apartment.class);
            System.out.println(apartment);
            apartmentList.add(apartment);
        }

//        // Convertir el JSON a un array de objetos Apartment
//        Apartment[] apartmentsArray = gson.fromJson(reader, Apartment[].class);
//
//        System.out.println(Arrays.asList(apartmentsArray));
//        List<Apartment> apartments = new ArrayList<>();
//        Collections.addAll(apartments, apartmentsArray);
//
//        // Ver un apartamento, para comprobar que funciona
//        System.out.println(apartments.get(0).toString());

        // Cerrar el reader
        reader.close();
    }
}
