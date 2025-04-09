package com.example;

import java.util.ArrayList;
import java.util.List;

public class ApartmentCreator {
    public static void main(String[] args) {
        //Creo lista
        List<Apartment> newAparments = new ArrayList<>();


        //nuevos pisos
        Apartment apartment1 = new Apartment("Calle Blanca 2", 234433.89, 4, "Hermoso apartamento bien ubicado", "Maria Gracia Bermont", true);
        Apartment apartment2 = new Apartment("Calle Braviera 998", 2132312.00, 2, "Amplios ambientes, mucha luz","Tomas Garcia", true);
        Apartment apartment3 = new Apartment("Carrer Moldavia 876", 87933.88, 2, "Bien ubicado","Patricia Lexter",true );

        //añado
        newAparments.add(apartment1);
        newAparments.add(apartment2);
        newAparments.add(apartment3);


        //compruebo
        System.out.println(newAparments);
    }
}
