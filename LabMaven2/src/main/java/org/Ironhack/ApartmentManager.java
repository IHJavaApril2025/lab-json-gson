package org.Ironhack;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) throws IOException {
        //Creamos el constructor de GSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Leemos el archivo JSON
        Reader reader = new FileReader("LabMaven2/src/main/resources/apartments.json");
        //Convertimos el Json a un array de objetos
        Apartment[] apartmentsArray = gson.fromJson(reader, Apartment[].class);

        //Creamos un ArrayList y añadimos los apartamentos
        List<Apartment> apartmentsList = new ArrayList<>();
        Collections.addAll(apartmentsList,apartmentsArray);

        for(Apartment apartment : apartmentsList){
            System.out.println(apartment);
        }


        reader.close();
    }
}
