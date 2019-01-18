package week_6.coffeeMaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMakersTest {

    @Test
    void CoffeMakersTest() {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.getCoffeMakers();
        List<Coffe> expectedCoffees = Arrays.asList(new Coffe("Auto drip",6),new Coffe("French press",10),new Coffe("Automatic",5));
        List<Coffe> coffes = new ArrayList<>();

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffe coffee = coffeeMaker.brew();
            coffes.add(coffee);
            }


        Assertions.assertEquals(expectedCoffees,coffes);

    }
}