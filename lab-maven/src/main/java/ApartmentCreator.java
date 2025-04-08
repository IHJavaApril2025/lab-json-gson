import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Apartment> newApartments = new ArrayList<>();

        Apartment apartamento1 = new Apartment(
                "Calle Mayor 123, Madrid",
                1200.00,
                3,
                "Luminoso piso en el centro con balcón y cocina equipada",
                "Agencia López",
                true
        );

        Apartment apartamento2 = new Apartment(
                "Avenida de Andalucía 45, Sevilla",
                950.50,
                2,
                "Acogedor apartamento cerca del parque, ideal para parejas",
                "Inmobiliaria Sur",
                false
        );

        Apartment apartamento3 = new Apartment(
                "Passeig de Gràcia 78, Barcelona",
                1800.75,
                4,
                "Ático de lujo con terraza privada y vistas a la ciudad",
                "Grupo BCN Homes",
                true
        );

        Apartment apartamento4 = new Apartment(
                "Rúa do Franco 12, Santiago de Compostela",
                750.00,
                1,
                "Estudio económico en zona histórica, perfecto para estudiantes",
                "Galicia Gestión",
                true
        );

        newApartments.add(apartamento1);
        newApartments.add(apartamento2);
        newApartments.add(apartamento3);

        System.out.println(newApartments);

        FileWriter writer = new FileWriter("lab-maven/src/main/resources/new-apartments.json");
        gson.toJson(newApartments,writer);
        writer.close();
    }
}
