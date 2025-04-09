import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) throws IOException {
        //inicializamos el Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // localizamos el archivo que queremos leer
        String fileLocation = "lab-maven/src/main/resources/apartments.json";
        FileReader reader = new FileReader(fileLocation);

        Apartment[] apartmentArray = gson.fromJson(reader, Apartment[].class);

        //JsonArray pisosArray = gson.fromJson(reader, JsonArray.class);
        //System.out.println(pisosArray.get(1));

        /* for (JsonElement apartment:pisosArray ){
            System.out.println("apartment: " + apartment);
            Apartment piso = gson.fromJson(apartment, Apartment.class);
            System.out.println("piso: "+ piso);
            apartmentList.add(piso);
        }*/

        List<Apartment> apartmentList = new ArrayList<>();
        Collections.addAll(apartmentList, apartmentArray);

        System.out.println(apartmentArray[0]);
        System.out.println(apartmentList.get(0));

        reader.close();

    }
}
