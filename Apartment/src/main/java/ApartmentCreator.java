import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {

    public static void main(String[] args) throws IOException {
        List<Apartment> apartmentList = new ArrayList<>();

        Apartment apartment1 = new Apartment("123 Main St", 200000, 1, "Main St","James",true);
        Apartment apartment2 = new Apartment("456 Elm St", 300000, 2, "Elm St","John",true);
        Apartment apartment3 = new Apartment("789 Oak St", 100000, 1, "Oak St","Peter",true);

        apartmentList.add(apartment1);
        apartmentList.add(apartment2);
        apartmentList.add(apartment3);

        System.out.println(apartment1);
        System.out.println(apartment2);
        System.out.println(apartment3);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String path = "Apartment/src/main/resources/";
        String fileName = "new_apartments.json";
        String file = path + fileName;

        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write(gson.toJson(apartmentList));
        fileWriter.close();
    }
}
