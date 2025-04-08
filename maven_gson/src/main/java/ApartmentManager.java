import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) {
        // path apartaments
        String path="./src/main/resources/apartments.json";
        // instance Gson
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        try {
            FileReader reader=new FileReader(path);
            String apartaments= gson.toJson(reader,Apartament.class);
            System.out.println(apartaments);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
