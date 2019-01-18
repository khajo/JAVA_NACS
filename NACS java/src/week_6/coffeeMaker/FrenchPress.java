package week_6.coffeeMaker;

public class FrenchPress extends  CoffeeMaker {
    @Override
    public String getName() {
        return "French press";
    }

    @Override
    public Integer getBrewingTime() {
        return 10;
    }
}
