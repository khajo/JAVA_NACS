package week_6.superhero;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {

    private Superhero batman = new Batman();
    private Superhero spiderman = new Spiderman();
    private Superhero superman = new Superman();



    public  Superhero call(){

        List<Superhero> superheroes = Arrays.asList(batman, spiderman, superman);
        Random random = new Random();
        Superhero superhero = superheroes.get(random.nextInt(2));
        return superhero;
    }
}
