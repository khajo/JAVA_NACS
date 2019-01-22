package week_10.ex_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokemonStream {
    public static void main(String[] args) {
        PokemonReader pokemonReader = new PokemonReader();

        // To do get pokemons names
        List<String> pokemonNames = pokemonReader.pokemonList().stream()
                .map(e -> e.split(";"))
                .map(e -> e[1])
                .collect(Collectors.toList());
        System.out.println("Pokemon names: "+pokemonNames);

        // to do get the first 10 longest name:
        pokemonNames.stream()
                .flatMap(e->Stream.of(e.split("")))
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
             //   .limit(10)
                .map(e->e.getKey()+ " | "+ e.getValue())
                .forEach(e-> System.out.println(e));






    }
}
