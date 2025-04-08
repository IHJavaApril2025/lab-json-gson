import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Calle Fe", 1100.00, 2, "Apartamento soleado y acogedor", "Carla Gómez", true);
        Apartment apartment2 = new Apartment("Calle San Ildefonso", 1200.00, 3, "Apartamento en pleno centro", "Sevi Fernández", false);
        Apartment apartment3 = new Apartment("Calle Eros", 1450.00, 4, "Ático con jacuzzi", "Montse Cubero", false);

        List<Apartment> newApartments = new ArrayList<>();
        newApartments.add(apartment1);
        newApartments.add(apartment2);
        newApartments.add(apartment3);

        System.out.println(newApartments);
    }

}
