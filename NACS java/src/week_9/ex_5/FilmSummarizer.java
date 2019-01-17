package week_9.ex_5;

import got.Character;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmSummarizer {
    private FilmReader filmReader = new FilmReader();
    private List<Film> films = filmReader.getFilms();

    public List<String> getHighestRating() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(e -> "'" + e.getTitle() + "'")
                .collect(Collectors.toList());
    }

    public List<String> getHighestRatingAndLongerThanThreeHours() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .filter(e -> Double.valueOf(e.getRuntime()) / 60 > 3)
                .limit(3)
                .map(e -> "'" + e.getTitle() + "'")
                .collect(Collectors.toList());
    }

    public List<String> getMostExpensiveBudget() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> getMostExpensiveBudgetLongerThan90Min() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(e -> e.getRuntime() < 90)
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> getratedOver7BudgetBetween() {
        return films.stream()
                .filter(e -> e.getScore() > 7)
                .filter(e -> e.getBudget() > 50000 && e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }
}
