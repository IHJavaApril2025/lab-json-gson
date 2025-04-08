import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class ApartamentCreator {
    public static void main(String[] args) {
        List<Apartament> apartamentsNew = new ArrayList<>();

        Apartament apartament1 = new Apartament("La Fabricas 32", 125.325, 4,
                "Piso acogedor", "Idealista", true);
        Apartament apartament2 = new Apartament("El cerro 37", 258.321, 7, "Piso " +
                "en reformas", "Fotocasa", true);
        Apartament apartament3 = new Apartament("La colmena 59", 326.457, 5,
                "Apartamento de lujo", "milAnuncios", true);

        apartamentsNew.add(apartament1);
        apartamentsNew.add(apartament2);
        apartamentsNew.add(apartament3);

        //Gson
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        //path archive new apartaments.json
        String path = "./maven_gson/src/main/resources/new_apartments.json";
        try {
            FileWriter writer=new FileWriter(path);
            gson.toJson(apartamentsNew,writer);
            writer.close();
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
