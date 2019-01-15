package ex4;


import ex5.Villain;

public class Spiderman implements Superhero {

    @Override
    public String getName() {
        return "Spiderman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }
}
