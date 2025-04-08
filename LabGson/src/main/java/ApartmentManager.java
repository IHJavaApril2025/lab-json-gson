import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) throws Exception {
        //inicializar gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //localizar archivo
        String fileLocation = "./src/main/resources/apartments.json";
        Reader reader = new FileReader(fileLocation);
        //convertir a array de obj apartment
        Apartment[] apartmentsArray = gson.fromJson(reader, Apartment[].class);
        //crear array list para añadir apartamentos
        List<Apartment> apartments = new ArrayList<>();
        Collections.addAll(apartments, apartmentsArray);

        System.out.println(apartments.get(0).toString());
        reader.close();

        /*
        JsonArray apartmentsArrayJson = gson.fromJson(reader, JsonArray.class);


        List<Apartment> apartmentList = new ArrayList<>();
        for (JsonElement apartmentElement : apartmentsArrayJson) {
            Apartment apartment = gson.fromJson(apartmentElement, Apartment.class);
            apartmentList.add(apartment);
        }
        System.out.println(apartmentList.get(0).toString());
*/



    }
}
