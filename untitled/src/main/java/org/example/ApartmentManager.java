package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.internal.GsonBuildConfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ApartmentManager {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson= new GsonBuilder().setPrettyPrinting().create();

        String fileLocation= "untitled/src/main/resources/apartments.json";
        FileReader reader = new FileReader(fileLocation );
        JsonArray apartmentArrayJson = gson.fromJson(reader,JsonArray.class);

        List<Apartment> apartmentList = new ArrayList<>();

        for (JsonElement apartmentJson : apartmentArrayJson){
            Apartment apartment =gson.fromJson(apartmentJson, Apartment.class);
            apartment.setId();
            apartmentList.add(apartment);
        }

        System.out.println(apartmentList.toString());


    }
}
