package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        List<Apartment> createdApartmentList = new ArrayList<>();
        //String address, int rooms, String description, String owner, boolean available
        Apartment apartment1= new Apartment("Calle del fuego",3, "Muy amplio", "Tecnocasa", true);
        Apartment apartment2= new Apartment("Calle Real",2, "Muy luminoso", "Tecnocasa", true);
        Apartment apartment3= new Apartment("Calle de la Magia",1, "Pequeño", "Tecnocasa", true);

        createdApartmentList.add(apartment1);
        createdApartmentList.add(apartment2);
        createdApartmentList.add(apartment3);

        FileWriter fileWriter = new FileWriter("untitled/src/main/resources/new_apartments.json");
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(createdApartmentList, fileWriter);

        fileWriter.close();
    }




}// end class
