package week_10.ex_1;

import ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {
    FileReader reader = new FileReader();

    public List<String> pokemonList() {
        return reader.asStream("week_10/ex_1/pokemon.csv")
                .skip(1)
                .collect(Collectors.toList());
    }


}
