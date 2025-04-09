package com.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        //Creo lista
        List<Apartment> newApartments = new ArrayList<>();


        //nuevos pisos
        Apartment apartment1 = new Apartment("Calle Blanca 2", 234433.89, 4, "Hermoso apartamento bien ubicado", "Maria Gracia Bermont", true);
        Apartment apartment2 = new Apartment("Calle Braviera 998", 2132312.00, 2, "Amplios ambientes, mucha luz","Tomas Garcia", true);
        Apartment apartment3 = new Apartment("Carrer Moldavia 876", 87933.88, 2, "Bien ubicado","Patricia Lexter",true );

        //añado
        newApartments.add(apartment1);
        newApartments.add(apartment2);
        newApartments.add(apartment3);


        //compruebo
        //System.out.println(newAparments);


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //creo archivo JSON
        FileWriter writer = new FileWriter("maven-gson/src/main/resources/new_apartments.json");
        // listas a JSON
        gson.toJson(newApartments, writer);

        writer.close();

    }
}
