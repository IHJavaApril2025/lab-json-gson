package org.Ironhack;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        //Creamos una lista de apartamentos
        List<Apartment> newApartments = new ArrayList<>();

        // Creamos  nuevos apartamentos
        Apartment apartment1 = new Apartment("Calle Falsa 123", 1200.50, 3, "Apartamento acogedor", "Juan Pérez", true);
        Apartment apartment2 = new Apartment("Avenida Siempre Viva 742", 1500.00, 4, "Apartamento amplio", "María López", false);
        Apartment apartment3 = new Apartment("Plaza Mayor 1", 2000.00, 5, "Apartamento de lujo", "Pedro García", true);
        Apartment apartment4 = new Apartment();
        System.out.println(apartment4);
        // Añadimos los apartamentos a la lista
        newApartments.add(apartment1);
        newApartments.add(apartment2);
        newApartments.add(apartment3);


        // Crear un FileWriter para escribir el archivo JSON
        FileWriter writer = new FileWriter("LabMaven2/src/main/resources/new_apartments.json");

        // Convertimos la lista de apartamentos a JSON y la escribimos en el archivo creado
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(newApartments, writer);

       writer.close();
    }
}
