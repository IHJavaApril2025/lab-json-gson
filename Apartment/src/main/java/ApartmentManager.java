import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApartmentManager {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String path = "Apartment/src/main/resources/";
        String fileName = "apartments.json";
        String file = path + fileName;

        FileReader fileReader = new FileReader(file);

        Apartment [] apartmentArray = gson.fromJson(fileReader, Apartment[].class);

        System.out.println(apartmentArray);

        List<Apartment> apartmentList = new ArrayList<>();
        Collections.addAll(apartmentList, apartmentArray);

        for (Apartment apartment : apartmentList) {
            System.out.println(apartment);
        }

    }
}
