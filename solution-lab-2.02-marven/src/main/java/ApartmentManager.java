import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fileLocation = "./solution-lab-2.02-marven/src/main/resources/apartments.json";

        FileReader reader = new FileReader(fileLocation);
        System.out.println(reader);


        JsonArray ApartmentArrayJson = gson.fromJson(reader, JsonArray.class);
        //System.out.println(ApartmentArrayJson);

        List<Apartment> apartmentList = new ArrayList<>();

        for (JsonElement apartmentElement: ApartmentArrayJson){
            Apartment apartment = gson.fromJson(apartmentElement, Apartment.class);
            apartmentList.add(apartment);
        }
        System.out.println(apartmentList);
    }
}
