package org.jmc.mydomain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        List<Apartment> list = new ArrayList<>();

        Apartment apartment1 = new Apartment("calle 1", 120.5, 2, "apartamento amplio", "Juan", true);
        Apartment apartment2 = new Apartment("calle 2", 340.5, 3, "apartamento acogedor", "Maria",true);
        Apartment apartment3 = new Apartment("calle 3", 348.0, 4, "lujoso", "Martina", true);

        list.add(apartment1);
        list.add(apartment2);
        list.add(apartment3);

        System.out.println(list);

        FileWriter writer = new FileWriter("./maven-gson/src/main/resources/new_apartments.json");

        // inicializamos el gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        gson.toJson(list, writer);

        writer.close();
    }
}
