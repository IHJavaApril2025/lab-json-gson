package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ApartmentManager {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File("apartments.json");
        Scanner scanner = new Scanner(file);
        StringBuilder json = new StringBuilder();
        while (scanner.hasNextLine()) {
            json.append(scanner.nextLine());
        }
        Apartment[] apartments = gson.fromJson(json.toString(), Apartment[].class);
        List<Apartment> apartmentsList = new ArrayList<>();
        Collections.addAll(apartmentsList, apartments);
    }
}
