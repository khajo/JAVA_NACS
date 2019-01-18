package week_6.coffeeMaker;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.getCoffeMakers();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffe coffe = coffeeMaker.brew();
            System.out.println(coffe.getMadeBy() + " brewed a coffee and it took " + coffe.getBrewedTime() + " minutes");


        }

        System.out.println("****************");


        checkone("French press");
        checkone("Automatic coffe machine");
        checkone("Auto drip");
        checkone("MoKA POT");

    }

    private static void checkone(String name) {
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
        if (coffeeMaker.isPresent()) {
            coffeeMaker.get().brew();
            System.out.println(coffeeMaker.get().getName() + " brewed a coffee and it took " + coffeeMaker.get().getBrewingTime() + " minutes");
        } else
            System.out.println("The coffee maker with the name " + name + " pot is not available");
    }
}


/*Use the CoffeeMakers class to receive all available coffee makers as a list. For each one of them,
brew a Coffee and display the madeBy and brewedTime from it.
Use the CoffeeMakers class to get one by one each CoffeeMaker. Check with the Optional if they are present,
 and if so, use them to brew a Coffee and display the madeBy and brewedTime from it.
Use the CoffeeMakers class to get one maker that does not exist. Check with the Optional
that it is not present and display a message saying that this particular coffee maker is not available.

Automatic coffee machine brewed a coffee and it took 5 minutes
French press brewed a coffee and it took 10 minutes
Auto drip brewed a coffee and it took 6 minutes
Automatic coffee machine brewed a coffee and it took 5 minutes
French press brewed a coffee and it took 10 minutes
Auto drip brewed a coffee and it took 6 minutes
The coffee maker with the name Moka pot is not available
*/
