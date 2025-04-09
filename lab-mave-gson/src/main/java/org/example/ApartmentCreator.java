package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {

        List<Apartment> newApartments = new ArrayList<>();

        Apartment apartment1 = new Apartment("123 Main St", 1200.50, 3, "Spacious apartment with a view", "John Doe", true);
        Apartment apartment2 = new Apartment("456 Elm St", 950.75, 2, "Cozy apartment in a quiet neighborhood", "Jane Smith", false);
        Apartment apartment3 = new Apartment("789 Oak St", 1500.00, 4, "Luxury apartment with modern amenities", "Alice Johnson", true);

        newApartments.add(apartment1);
        newApartments.add(apartment2);
        newApartments.add(apartment3);
        System.out.println(newApartments);

        FileWriter writer = new FileWriter("lab-mave-gson/src/main/resources/new_apartments.json");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(newApartments, writer);
        writer.close();
    }
}
