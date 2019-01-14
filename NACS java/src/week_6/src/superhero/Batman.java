public class Batman implements Superhero {
    @Override
    public String getName() {
        return "batman";
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
