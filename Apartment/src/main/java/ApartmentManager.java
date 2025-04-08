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

        String path = "Apartment/src/main/resources/";
        String fileName = "apartments.json";
        String file = path + fileName;

        FileReader fileReader = new FileReader(file);

        JsonArray apartmentArrayJson = gson.fromJson(fileReader, JsonArray.class);

        System.out.println(apartmentArrayJson);

        List<Apartment> apartmentList = new ArrayList<>();


        for (JsonElement userElement : apartmentArrayJson) {
            Apartment apartment = gson.fromJson(userElement, Apartment.class);
            apartmentList.add(apartment);
            apartment.setId();
            System.out.println(apartment);
        }
    }
}
