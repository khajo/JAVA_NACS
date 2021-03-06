package week_6.coffeeMaker;

public abstract class CoffeeMaker {

    public abstract String getName();

    public abstract Integer getBrewingTime();

    public Coffe brew() {
        Coffe coffe = new Coffe(getName(), getBrewingTime());

        return coffe;
    }
}
