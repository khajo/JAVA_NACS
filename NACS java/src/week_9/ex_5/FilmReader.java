package week_9.ex_5;

import ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    private FileReader reader = new FileReader();


    public List<Film> getFilms() {
        return reader.asStream("week_9/ex_5/films.csv")
                .skip(1)
                .map(e -> Arrays.asList(e.split(";")))
                .map(e -> new Film(e.get(8), Double.valueOf(e.get(9)), Integer.valueOf(e.get(10)),
                        Integer.valueOf(e.get(6)), Long.valueOf(e.get(0)), Long.valueOf(e.get(5))))
                .collect(Collectors.toList());
    }
}
