import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) throws IOException {
        List<Apartment> apartmentList = new ArrayList<>();


        Apartment apartment1 = new Apartment("Avda/ De los codigos - Madrid, España", 375000.00, 4, "Moderno piso con terraza y vistas a la ciudad, perfecto para familias.", "María González", true);
        Apartment apartment2 = new Apartment("Calle Colón 12, Valencia, España", 275000.00, 3, "Elegante vivienda con espacios amplios y luz natural.", "Elena Fernández", true);
        Apartment apartment3 = new Apartment("Avenida Diagonal 231, Barcelona, España", 189000.00, 2, "Acogedor apartamento en zona céntrica, cerca de transporte público.", "Carlos Ramírez", false);

        apartmentList.add(apartment1); System.out.println(apartment1);
        apartmentList.add(apartment2); System.out.println(apartment2);
        apartmentList.add(apartment3); System.out.println(apartment3);

        //______________Exercise 5⬇️________________

        List<Apartment> newApartment = new ArrayList<>();
        Gson gson = new Gson();

        Apartment apartment4 = new Apartment("Avenida Diagonal 231, Barcelona, España", 189000.00, 2, "Acogedor apartamento en zona céntrica, cerca de transporte público.", "Carlos Ramírez", false);
        newApartment.add(apartment4);

        FileWriter newFileApartment = new FileWriter("newFileApartment.json");
        gson.toJson(apartment4, newFileApartment);
        newFileApartment.close();
    }
}
