package week_6.superhero;

public class Spiderman implements Superhero {
    @Override
    public String getName() {
        return "spiderman";
    }

    @Override
    public void fight(Villain villain) {

        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
