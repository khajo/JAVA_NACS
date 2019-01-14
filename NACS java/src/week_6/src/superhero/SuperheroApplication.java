import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Superhero superhero = superheroCaller.call();
        System.out.println(superhero.getName());

        List<Superhero> superheroes = addSuperhero();
        System.out.println("Superhero: "+superheroes);

        display(superheroes);
        System.out.println("Number of superhero: "+superheroes.size());

    }

    private static void display(List<Superhero> superheroes) {
        for (int position = 0; position < 6; position++) {
            System.out.println("Superhero "+ (position +1) +":"+ superheroes.get(position) );
        }

    }

    private static List<Superhero> addSuperhero() {
        List<Superhero> superheroes = new ArrayList<>();
        SuperheroCaller superheroCaller = new SuperheroCaller();

        for (int position = 1; position < 7; position++) {
            Superhero superhero = superheroCaller.call();
            superheroes.add(superhero);
        }
        return superheroes;
    }

}