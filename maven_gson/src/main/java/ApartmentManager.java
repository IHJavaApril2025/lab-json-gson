import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ApartmentManager {
    public static void main(String[] args) {
        // path apartaments
        String path="./maven_gson/src/main/resources/apartments.json";
        // instance Gson
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        try {
            FileReader reader=new FileReader(path);
            JsonArray apartamentsJson= gson.fromJson(reader,
                    JsonArray.class);
            // new List
            List<Apartament>apartamentList=new ArrayList<>();
            for (JsonElement apartament:apartamentsJson){
                Apartament apartaments=gson.fromJson(apartament,
                        Apartament.class);
                        System.out.println(apartaments.toString());
                apartamentList.add(apartaments);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
