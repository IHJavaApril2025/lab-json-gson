import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        List<Apartment> apartments = new ArrayList<>();

        Apartment apartment1 = new Apartment("C/Tomillo 5",700, 3,"Apartamento luminoso cercade la sierra", "Jose Pérez", true);
        Apartment apartment2 = new Apartment("C/Edison", 1500,4,"Muy moderno, amueblado", "Rosa Ruiz",true);
        Apartment apartment3 = new Apartment("C/Capuchinos", 1100,1,"Estudio acogedor en el centro", "Carlos Lopez",false);
        Apartment apartment4 = new Apartment("C/Lemus", 2000,5,"Duplex con jardin", "Joaquin Gomez",false);

        apartments.add(apartment1);
        apartments.add(apartment2);
        apartments.add(apartment3);
        apartments.add(apartment4);

        System.out.println("Apartamentos añadidos: "+ apartment1);

        FileWriter apartmentWriter = new FileWriter("new_apartments.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(apartments, apartmentWriter);

        apartmentWriter.close();
    }
}