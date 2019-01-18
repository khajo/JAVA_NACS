package week_5.ex5;


import week_5.ex4.Superhero;
import week_5.ex4.SuperheroCaller;

public class AdvancedSuperheroApplication {

    public static void main(String[] args) {
        SuperheroCaller caller = new SuperheroCaller();
        Joker joker = new Joker();
        for (int times = 0; times < 10; times++) {
            Superhero superhero = caller.call();
            superhero.fight(joker);
        }
    }

}
