package week_6.src.coffeeMaker;

public class AutoDrip extends  CoffeeMaker {
    @Override
    public String getName() {
        return "Auto drip";
    }

    @Override
    public Integer getBrewingTime() {
        return 6;
    }
}
