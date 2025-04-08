import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class ApartmentManager {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Reader reader = new FileReader("apartments.json");
        Apartment[] apartmentsArr = gson.fromJson(reader, Apartment[].class);

        List<Apartment> apartmentList= new ArrayList<>();

        Collections.addAll(apartmentList, apartmentsArr);

        for(Apartment each:apartmentList) {
            if (each.getId() == null) {
                each.setId(UUID.randomUUID().toString());
            }
        }

        System.out.println(apartmentList);
        reader.close();
    }
}
