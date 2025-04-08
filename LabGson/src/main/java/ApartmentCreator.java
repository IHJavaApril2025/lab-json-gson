import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;


public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        Apartment apartment1 = new Apartment("Calle Fe", 1100.00, 2, "Apartamento soleado y acogedor", "Carla Gómez", true);
        Apartment apartment2 = new Apartment("Calle San Ildefonso", 1200.00, 3, "Apartamento en pleno centro", "Sevi Fernández", false);
        Apartment apartment3 = new Apartment("Calle Eros", 1450.00, 4, "Ático con jacuzzi", "Montse Cubero", false);

        List<Apartment> newApartments = new ArrayList<>();
        newApartments.add(apartment1);
        newApartments.add(apartment2);
        newApartments.add(apartment3);

        System.out.println(newApartments);

        //añadimos archivo JSon con nueva lista
        FileWriter writer = new FileWriter("./src/main/resources/new_apartments.son");

        Gson gson = new Gson();//me daba error sin hacer esto
        gson.toJson(newApartments, writer);

        //cerrar
        writer.close();


    }

}
