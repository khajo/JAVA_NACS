package week_6.superhero;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {


        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();

        for (int time = 0; time <10 ; time++) {
            Superhero superhero = superheroCaller.call();
            joker.weaken(superhero.getName());

        }
    }
}
