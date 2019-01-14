package week_6.src.coffeeMaker;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {
    private static List<CoffeeMaker> coffeeMakers = Arrays.asList(new AutoDrip(), new FrenchPress(), new AutomaticCoffeeMachine());


    public static List<CoffeeMaker> getCoffeMakers() {

        return coffeeMakers;
    }

    public static Optional<CoffeeMaker> get(String name) {
        for (CoffeeMaker coffeemaker : coffeeMakers) {
            if (coffeemaker.getName().equalsIgnoreCase(name)) {
                return Optional.of(coffeemaker);
            }
        }
        return Optional.empty();
    }

}
