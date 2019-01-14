public class Superman implements Superhero {
    @Override
    public String getName() {
        return "superman";
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
