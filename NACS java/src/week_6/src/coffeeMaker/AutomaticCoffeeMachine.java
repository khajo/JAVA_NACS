package week_6.src.coffeeMaker;



public class AutomaticCoffeeMachine extends CoffeeMaker {

    @Override
    public String getName() {
        return "Automatic coffe machine";
    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }
}
