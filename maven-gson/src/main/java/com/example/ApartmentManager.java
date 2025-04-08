package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) throws IOException {
        //inicializo gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //localizo el archivo que queremos leer
        String fileLocation = "./maven-gson/src/main/resources/apartments.json";
        FileReader reader = new FileReader(fileLocation);
        //convierto Json en un array de objetos
        Apartment[] apartmentArrayJson = gson.fromJson(reader, Apartment[].class);

        //Creo un arrayList y añado los pisos
        List<Apartment> apartmentsList = new ArrayList<>();
        Collections.addAll(apartmentsList, apartmentArrayJson);

        System.out.println(apartmentsList.get(1).toString());

        reader.close();


        }
    }

